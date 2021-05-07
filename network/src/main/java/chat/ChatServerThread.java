package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickName = null;
	private Socket socket = null;
	List<PrintWriter> listWriters = null;
	
	public ChatServerThread(Socket socket, List<PrintWriter> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort();
		ChatServer.log("connected by client[" + remoteHostAddress + ":" + remoteHostPort +"]" );
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
		
			while(true) {
				String request = br.readLine();
				
				if(request == null) {
					ChatServer.log("클라이언트로 부터 연결 끊김");
					doQuit(pw);
					break;
				}
				
				String[] tokens = request.split(":");
				if("join".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if("quit".equals(tokens[0])) {
					doQuit(pw);
				} else {
					ChatServer.log("에러: 알 수 없는 요청(" + tokens[0] + ")");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		
		String data = this.nickName + "님이 퇴장 하였습니다.";
		broadcast(data);
	}

	private void removeWriter(PrintWriter writer) {
		synchronized (listWriters) {
            listWriters.remove(writer);
        }
	}

	private void doMessage(String data) {
		broadcast(this.nickName + ":" + data);
	}

	private void doJoin(String nickName, PrintWriter writer) {
		this.nickName = nickName;
		String data = this.nickName + "님이 참여하였습니다.";
		broadcast(data);
		
		addWriter(writer);
		
		writer.println("join:ok");
		writer.flush();
	}

	private void addWriter(PrintWriter writer) {
		synchronized(listWriters) {
			listWriters.add(writer);
		}
	}
	
	private void broadcast(String data) {
		synchronized (listWriters) {
			for(PrintWriter writer : listWriters) {
				writer.println(data);
				writer.flush();
			}
		}
	}
}

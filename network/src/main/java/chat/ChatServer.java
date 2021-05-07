package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	public static final int PORT = 5000;
	
	public static void main(String[] args) {
		List<PrintWriter>listWriters = new ArrayList<PrintWriter>();
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			log("연결 기다림 " + hostAddress + " : " + PORT);
			
			while(true) {
				socket = serverSocket.accept();
				new ChatServerThread(socket ,listWriters).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void log(String log) {
		System.out.println("[ChatServer] " + log);
	}

}

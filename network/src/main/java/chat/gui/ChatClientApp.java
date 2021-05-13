package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import chat.ChatServer;

public class ChatClientApp {
	private static final int SERVER_PORT = ChatServer.PORT;

	public static void main(String[] args) {
		
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;

		while (true) {

			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();

			if (name.isEmpty() == false) {
				break;
			}

			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}
		scanner.close();
		
		try {
			// 1. create socket
			socket = new Socket();
			
			// 2. connect to server
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			socket.connect(new InetSocketAddress(hostAddress, SERVER_PORT));
			
			// 3. create iostream
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
					true);
			
			// 4. join
			pw.println("join:" + name);
			pw.flush();
			
			String line = br.readLine();
			if ("join:ok".equals(line)) {
				new ChatWindow(name, socket).show();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

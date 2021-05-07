package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ChatClientThread extends Thread {
	private BufferedReader br = null;
	private Socket socket = null;

	public ChatClientThread(Socket socket, BufferedReader br) {
		this.socket = socket;
		this.br = br;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String data = br.readLine();
				if (data == null) {
					ChatServer.log("closed by client");
					break;
				}
				System.out.println(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPTimeServer {
	public static final int PORT = 7777;
	public static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		DatagramSocket socket = null;
		
		try {
			// 1. 소켓 생성
			socket = new DatagramSocket(PORT);
			
			while(true) {
				// 2. 데이터 수신
				DatagramPacket receivePacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
				socket.receive(receivePacket); // blocking
				
				byte[] receiveData = receivePacket.getData();
				int length = receivePacket.getLength();
				String message = new String(receiveData, 0, length, "utf-8");
				
				System.out.println("[server] receive: " + message);
				// 3. 데이터 송신
				String now = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
				
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}

package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPTimeClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = UDPTimeServer.PORT;
	private static final int BUFFER_SIZE = UDPTimeServer.BUFFER_SIZE;

	public static void main(String[] args) {
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket();
			
//			byte[] sendData = "".getBytes();
			DatagramPacket sendPacket = new DatagramPacket("".getBytes(), 0, new InetSocketAddress(SERVER_IP, SERVER_PORT));
			socket.send(sendPacket);
			
			DatagramPacket receivePacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
			socket.receive(receivePacket);
			
			byte[] receiveData = receivePacket.getData();
			int length = receivePacket.getLength();
			String now = new String(receiveData, 0, length, "utf-8");
			
			System.out.println(now);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

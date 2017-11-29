package test01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramPacket sendPoket = null;

		try {
			sendSocket = new DatagramSocket();
			String sendMsg = "안녕하세요";
			byte[] sendByte = sendMsg.getBytes();

			sendPoket = new DatagramPacket(sendByte, sendByte.length, 
					InetAddress.getByName("70.12.111.130"), 1111);
			sendSocket.send(sendPoket);
			System.out.println("보냈음!");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			System.out.println("소켓 예외 발생!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이상한 에러!!");
			e.printStackTrace();
		} finally {
			sendSocket.close();
		}

	}
}

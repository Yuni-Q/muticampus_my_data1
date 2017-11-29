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
			String sendMsg = "�ȳ��ϼ���";
			byte[] sendByte = sendMsg.getBytes();

			sendPoket = new DatagramPacket(sendByte, sendByte.length, 
					InetAddress.getByName("70.12.111.130"), 1111);
			sendSocket.send(sendPoket);
			System.out.println("������!");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� �߻�!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�̻��� ����!!");
			e.printStackTrace();
		} finally {
			sendSocket.close();
		}

	}
}

package test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {

		DatagramSocket socket = null;
		DatagramPacket paket = null;

		byte[] receiveData = new byte[512];
		try {
			socket = new DatagramSocket(1111);
			paket = new DatagramPacket(receiveData, receiveData.length);

			System.out.println("������ ��ٸ�����....");
			socket.receive(paket);
			System.out.println("�޾���!:" + new String(receiveData));

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� �߻�!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException �߻�!");
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}

}
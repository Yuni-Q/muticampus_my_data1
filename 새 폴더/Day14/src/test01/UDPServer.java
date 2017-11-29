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

			System.out.println("서버가 기다리는중....");
			socket.receive(paket);
			System.out.println("받았음!:" + new String(receiveData));

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			System.out.println("소켓 예외 발생!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException 발생!");
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}

}
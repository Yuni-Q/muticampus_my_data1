package test03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999);
		System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� ��... ...");
		Socket socket = serversocket.accept();
		System.out.println("Ŭ���̾�Ʈ ������!");
/////////////////////////////////////////////////////////
		SpeakThread st = new SpeakThread(socket);
		ListenThread lt = new ListenThread(socket);

		st.start();
		lt.start();

	}
}

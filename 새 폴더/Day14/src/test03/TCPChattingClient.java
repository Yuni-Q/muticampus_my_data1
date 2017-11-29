package test03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPChattingClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("70.12.111.130", 9999);
		System.out.println("서버에 연결됨!");
		////////////////////////////////////
		SpeakThread st = new SpeakThread(socket);
		ListenThread lt = new ListenThread(socket);

		st.start();
		lt.start();

	}
}

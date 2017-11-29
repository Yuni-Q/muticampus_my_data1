package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListenThread extends Thread {
	private BufferedReader br;

	public ListenThread(Socket socket) {
		try {
			br = new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("Listen inputStream Exception!!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//////////////////////////////////////////////////
	@Override
	public void run() {

		try {
			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("받은 메세지>>" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("연결이 종료 됐나봐요. 채팅 종료됨... ...");
			e.printStackTrace();
		}

	}

}

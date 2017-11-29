package test03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SpeakThread extends Thread {

	private BufferedWriter bw;

	public SpeakThread(Socket socket) {
		// 쓰레드 객체 외부에서 전달받은 socket 객체를 이용하여
		// 메세지 보내는데 필요한 BufferedWriter 초기화 작업
		try {
			bw = new BufferedWriter(new OutputStreamWriter
					(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("Speak outputStream Exception!!");
			e.printStackTrace();
		}
	}

	// 쓰레드 작업 지시서 run() 메소드, 메세지 보내는 작업만 반복됨.
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("보낼 메세지>>");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("연결이 종료되었습니다. 채팅 종료!");

			e.printStackTrace();
		}

	}

}

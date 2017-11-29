package test03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SpeakThread extends Thread {

	private BufferedWriter bw;

	public SpeakThread(Socket socket) {
		// ������ ��ü �ܺο��� ���޹��� socket ��ü�� �̿��Ͽ�
		// �޼��� �����µ� �ʿ��� BufferedWriter �ʱ�ȭ �۾�
		try {
			bw = new BufferedWriter(new OutputStreamWriter
					(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("Speak outputStream Exception!!");
			e.printStackTrace();
		}
	}

	// ������ �۾� ���ü� run() �޼ҵ�, �޼��� ������ �۾��� �ݺ���.
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("���� �޼���>>");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("������ ����Ǿ����ϴ�. ä�� ����!");

			e.printStackTrace();
		}

	}

}

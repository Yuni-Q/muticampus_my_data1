package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("70.12.111.137", 3333);
		System.out.println("������ ���� �ϳ��� ȹ����!");
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		// �޼��� �۽� �κ�
		while (true) {
			System.out.println("���� �޼��� >>");
			String sendMsg = sc.nextLine();
			bw.write(sendMsg + "\n");
			bw.flush();

			String receiveMsg = br.readLine();
			System.out.println("������ ����: " + receiveMsg);
			if (receiveMsg.equals("bye"))
				break;
		}
		// ���α׷� ���� ���� ����ѿ� �ݳ�
		br.close();
		bw.close();
		socket.close();
	}
}

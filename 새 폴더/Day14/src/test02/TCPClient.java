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
		System.out.println("서버와 소켓 하나씩 획득함!");
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		// 메세지 송신 부분
		while (true) {
			System.out.println("보낼 메세지 >>");
			String sendMsg = sc.nextLine();
			bw.write(sendMsg + "\n");
			bw.flush();

			String receiveMsg = br.readLine();
			System.out.println("서버로 부터: " + receiveMsg);
			if (receiveMsg.equals("bye"))
				break;
		}
		// 프로그램 종료 전에 사용한원 반납
		br.close();
		bw.close();
		socket.close();
	}
}

package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;

		serverSocket = new ServerSocket(3333);

		System.out.println("server wait... ...");
		socket = serverSocket.accept(); // 요청이 들어오면 소켓 생성!
		System.out.println("client request coming!");

		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메세지 기다리는 중... ...");
			String receiveMsg = br.readLine();
			System.out.println("수신 메세지: " + receiveMsg);

			if (receiveMsg.equals("bye"))
				break;

			System.out.println("보낼 메세지>>");
			String sendMsg = sc.nextLine();
			bw.write(sendMsg + "\n");
			bw.flush();
		}
		// 프로그램 종료하기 전에 사용한 자원 반납하기.
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();

	}

}

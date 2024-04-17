package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 에코 서버 
public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			// 서버 소켓 열기
			serverSocket = new ServerSocket();
		
			// 접속 아이피에 바인딩
			InetSocketAddress bindIp = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(bindIp);
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			// 접속 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
//			System.out.println("=============");
//			System.out.println("<서버 종료>");
			
		// 클라이언트 접속 -> 통신용 소켓 발급 -> 서버 쓰레드 생성
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		
	}

}

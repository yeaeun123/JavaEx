package com.javaex.network.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

//v1. 접속대기
// TCP 소켓 프로그래밍 절차
public class Client {

	public static void main(String[] args) {
		// socket (소켓) 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			// 시작 메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
		
		// connect(커넥트) 시도
			// 서버 주소와 포트 확보
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			
			System.out.println("[서버에 연결되었습니다.]");
			
			//  종료
			System.out.println("<클라이언트 종료>");
		
		
		} catch (ConnectException e ) {
			System.err.println("접속이 거부되었습니다.");
		} catch (IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

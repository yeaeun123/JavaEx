package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir")+ "\\files\\";
	private static String filename = rootPath + "primitives.bin";
	
	// 기본 데이터타입을 byte로 저장하는 보조 스트림 
	public static void main(String[] args) {
		// DataOutputStream을 이용한 기본 데이터 저장
//		writePrimitives();
		// DataInputStream을 이용한 기본 데이터 읽어오기
		readPrimitives();
		
	}
	
	private static void writePrimitives() {
		// 스트림 열기
		try (
				// 기본 스트림
				OutputStream fos = new FileOutputStream(filename);
				
				// 보조 스트림
				DataOutputStream dos = new DataOutputStream(fos);
				)
		{	//1 Set
			dos.writeUTF("홍길동");	// String 저장
			dos.writeBoolean(true); // boolean 저장
			dos.writeInt(25);		// int 저장
			dos.writeFloat(80.9f);	// float 저장
			//2 Set
			dos.writeUTF("고길동"); 
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(99.9f);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void readPrimitives() {
		System.out.println("저장파일 : " + filename);
		
		try(
				// 주 스트림
				InputStream fis = new FileInputStream(filename);
				// 보조 스트림
				DataInputStream dis = new DataInputStream(fis);
				)
		{
			// 출력된 순서와 같은 순서로 읽어야만 한다!! 순서 바뀌면 error!
			for(int i = 0; i < 2; i++) {
				String s = dis.readUTF();	// String 읽기
				boolean b = dis.readBoolean(); // boolean 읽기
				int i2 = dis.readInt();		// int 읽기
				float f = dis.readFloat(); 	// float 읽기 
				
				System.out.println(s);
				System.out.println(b);
				System.out.println(i2);
				System.out.println(f);
			
		} 
		} catch (FileNotFoundException e ) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();
			
		}
		
	}

}

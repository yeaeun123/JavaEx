package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//files\last-leaf.txt ->"줄단위로 읽어들이고"
//"leaf" or "leaves"  단어가 들어간 문장만 뽑아서
//->filtered.txt 저장
public class BufferedCharStreamEx {
	private static String rootPath = System.getProperty("user.dir")+ "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";
	
	// source에서 leaf or leaves 가 포함된 문장만 필터링
	// target에 저장
	public static void main(String[] args) {
		System.out.println("원본파일 : " + source);
		System.out.println("필터파일 : "+ target);
		
		try(
				// 주 스트림 연결
				Reader fr = new FileReader(source);
				Writer fw = new FileWriter(target);
				
				// 보조 스트림 연결
				// 라인 단위 문자열 작업 -> Buffer 기능 사용
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				
				)
		{
			// 한줄 단위로 읽고 쓰는데 특화
			String line = "";
			while ((line = br.readLine()) != null) {
				// 읽어들일 라인이 없으면 null 
//				System.out.println(line);
			 //leaf, leaves가 들어있는 라인만 필터링
			if (line.toLowerCase().contains("leaf") ||
			line.toLowerCase().contains("leaves")){		
//				System.out.println(line);
				//필터링된 라인만 별도 저장
				bw.write(line);
				bw.newLine();
			}
				
			}
			
			System.out.println("필터링 완료!");
			
		} catch (FileNotFoundException e ) {
			System.err.println("파일을 찾을 수 없습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();
		}
		
	}

}

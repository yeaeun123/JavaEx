package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	// files의 경로(실제) 위치
	private static String rootPath = System.getProperty("user.dir") + "\\files";

	// 시스템객체가 갖고 있는 실행정보 확인
	public static void main(String[] args) {
		System.out.println("루트 경로 : " + rootPath);

		File f = new File(rootPath); // 파일명으로 파일 정보 객체 생성 (파일생성이아님)
		System.out.println(rootPath + ":" + (f.exists() ? "존재함" : "없음"));

		// 정보 출력
		printFileInfo(f);

		// 디렉터리 만들기
		// files 디렉터리 아래 files\\subdir\\subdir2 -> 디렉터리 생성하려면?
		File newDir = new File(rootPath + "\\subdir\\subdir2"); // 파일(디렉터리) 정보만듦
		if (!newDir.exists()) { // 존재 여부 확인 (not)
			if (newDir.mkdirs()) { // 실제 생성
				System.out.println(newDir + "을 생성했습니다.");
			}
		}
		printFileInfo(f);

		// 새로 생성한 files\\subdir 디렉터리에 새 파일 myfile.txt를 만들어보자.
		File newFile = new File(rootPath + "\\subdir\\myfile.txt");
		// 파일 객체 생성 -> 정보객체 생성하는 것, 파일을 만드는 것이 아니다.
		if (!newFile.exists()) { // 존재 여부를 확인 후, 없으면 생성
			try {
				newFile.createNewFile(); // 실제 파일 생성
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요.");
			}

		}
		// 목록출력
		printFileInfo(f);

		// 파일 삭제
		newFile.delete();

	}

	private static void printFileInfo(File f) {
		System.out.println("------------------");

		// 전달 받은 파일 객체가 디렉터리인가?
		if (f.isDirectory()) { // 디렉터리면 목록을 출력해보자
			System.out.println("디렉터리: " + f.getName());

			// 파일 목록 가져오기
			File[] files = f.listFiles(); // 파일 정보의 배열

			// 목록 정보 출력
			// f rwx 파일명 파일사이즈
			// d rwx 디렉터리명

			for (File file : files) { // files배열에서 file을 한개씩 꺼내온다.
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.print(file.canRead() ? "r" : ".");
				System.out.print(file.canWrite() ? "w" : ".");

				System.out.print(file.canExecute() ? "x" : ".");

				System.out.print(" " + file.getName()); // 파일명
				System.out.println("\t" + file.length()); // 파일 사이즈

			}

		} else { // 파일 -> 간략정보
			System.out.println("File: ");
			// 간략한 파일 정보
			System.out.println(f.getName() + "\t"); // 파일명
			System.out.println(f.canRead() ? "r" : "."); // 읽을 수 있는 파일인가?
			System.out.println(f.canWrite() ? "w" : "."); // 기록할 수 있는 파일인가?
			System.out.println(f.canExecute() ? "X" : "."); // 실행할 수 있는 파일인가?
			System.out.println();
		}
	}

}

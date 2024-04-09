package com.javaex.funtional.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) {
		int scores[] = {80, 90, 70, 100, 60, 50};
		
		// 배열에서 스트림을 뽑아내는 방법
		IntStream arrStream = Arrays.stream(scores);
		System.out.println(arrStream);

	}

}

package com.javaex.basic.loop;

public class WhileLotto {

	public static void main(String[] args) {
		
		
		int i = 0;
		
		while(i < 6) {
			System.out.print((int)(Math.random()* 45) +1 +" ");
			i += 1;
		}
	}

}

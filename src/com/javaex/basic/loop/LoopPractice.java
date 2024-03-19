package com.javaex.basic.loop;

public class LoopPractice {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		forGugu();
//		whileGugu();
//		forStar();
		whileStar();
}
	public static void forGugu() {
			for (int dan =2; dan <= 9; dan ++) {
				// 단수 돌리기 : 2,3,4,...,9
				for(int num =1; num <= 9; num ++) {
				System.out.println(dan +"*" + num +"=" +dan *2);
				
			}
		}
	}
	public static void whileGugu() {
		int dan =2, num ;
		
		while(dan <= 9) { //단수가 9이하인 동안
			num=1;
			while (num <= 9) { //num이 1~9 까지
			System.out.println(dan+ "*"+ num + "=" + dan*num); //2*1=2로 출력되게
			num +=1; //num 1씩 더해서 
		}
			dan +=1; //num끝나면 dan도 1씩 더해서 다 출력
	}
	}
	public static void forStar() {
		//행루프 1~6
		for (int row =1; row <=6; row ++) {
			//열루프 : 1~현재 row
			for (int col=1; col <=row ; col ++) {
				System.out.print("*");
			}
			System.out.println(); //강제 개행
			
		}
	}
	public static void whileStar() {
		int row = 1, col;
		
		while(row <=6) {
			//행루프 :1~row까지
			col = 1;
			while(col <=row) {
				System.out.print("*");
				col += 1; //탈출조건!! 1씩 늘어나다가 row와 같거나 작을때만 실행후 탈출
			}
			System.out.println();
			row +=1; //탈출조건 만들어주기**
		}
		
	}
}

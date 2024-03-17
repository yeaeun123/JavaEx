//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//[Ex01.java]
//다음 중 에러가 발생하는 문장은? 	1번 if ( i==0)
//(1) If ( i=0 ) {….}
//(2) If ( j<10 ) {…}
//(3) switch( 'A' ){….}
//(4) switch( 100 ){…}
//(5) switch( "A" ){…}
//(6) if ( name == "홍길동" 
//
//다음 중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은? 2,3,4,5,9
//(1) boolean
//(2) char
//(3) byte
//(4) short
//(5) int
//(6) long
//(7) float
//(8) double
//(9) String

//다음 코드의 오류 내용을 찾고 바르게 수정해주세요 (&& age 추가)


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//				;
//		int age = 15;
//		//age가 0살 초과이고 18살 미만이면 
//		if (0< age && age < 18) {
//			System.out.println("청소년입니다.");
//		}
//
//	} 
//
////다음 코드의 오류 내용을 찾고 바르게 수정해주세요 (if(x == 0) 으로 수정)
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x = 0;
//		
//		//x가 0과 같으면
//		if ( x == 0) {
//			System.out.println("x는 0이다.");
//			
//		}
//	}
//	
//	
//	//[Ex05.java] 아래와 같이 작성된 코드가 있다.
//	보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요. -> 20 미만으로 입력하면 1번그룹, 20 이상으로 입력하면 2번그룹 출력
//	import java.util.Scanner;
//
//	public class JavaC {
//
//		//아래와 같이 작성된 코드가 있다.
//		//보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			int age;
//			
//			Scanner sc = new Scanner(System.in);
//					
//					System.out.println("나이를 입력해주세요.");
//			System.out.print("나이 : ");
//			age = sc.nextInt();
//			
//			if (age > 20) {
//				System.out.print("\"1번그룸\"");
//		} else {
//			System.out.println("\"2번그룸.\"");
//		}
//			sc.close();
//
//		}
//
//	}
//	[Ex06.java]
//			나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
//			작성하세요.
//	
//	import java.util.Scanner;
//
//	public class JavaD {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			int age;
//			
//			Scanner sc = new Scanner(System.in);
//					
//					System.out.println("나이를 입력해주세요.");
//			System.out.print("나이 : ");
//			age = sc.nextInt();
//			
//			if (19 >= age && age < 65) {
//				System.out.print("\"1번그룸\"");
//		} else {
//			System.out.println("\"2번그룸.\"");
//		}
//			sc.close();
//
//			}
//
//		}
//
//	[Ex07.java]
//			나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("나이를 입력해주세요.");
//		System.out.print("나이 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		
//		int bus = 0 ;
//		
//		if (age >= 0 && age <= 7) {
//			bus = 0;
//			System.out.println("취학 전 아동/무료입니다.");
//		} else if (age >= 8 && age <=13) {
//			System.out.println("초등학생 / 2000원 입니다.");
//		} else if (age >= 14 && age <= 16) {
//			System.out.println("중학생 / 3000원 입니다.");
//		} else if (age >= 17 && age <=19) {
//			System.out.println("고등학생/ 4000원 입니다.");
//		} else {
//			System.out.println("성인 / 5000원 입니다.");
//		}
//			
//		sc.close();
//			
//		}
////	}
//[Ex08.java]
//사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_8 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("키와 몸무게를 입력해 주세요.");
//		
//		Scanner.scanner = new Scanner(System.in);
//		
//		System.out.println("키: ");
//		double hei = scanner.nextDouble();
//		System.out.println("몸무게");
//		double wei = scanner.nextDouble();
//		double bmi = wei / hei;
//		System.out.println("결과: ");
//		
//		if (bmi < 18.5) {
//			System.out.println("저체중입니다.");
//		} else if (bmi >= 18.5 && bmi <= 24.9) {
//			System.out.println("정상체중입니다.");
//		} else {
//			System.out.println("과체중입니다.");
//		}
//		
//		scanner.close();
//
//		
//	}
//
////}
//[Ex09.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
//니다.
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_9 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("태어난 년도를 입력해 주세요.");
//		System.out.print("년도: ");
//	
//		int birth = scanner.nextInt();
//		int today = 2023;
//		int age = today-birth;
//		
//		if (age < 15 || age >=65) {
//		System.out.println(age +"살 무료예방접종 대상자입니다.");
//	} else {
//		System.out.println(age +"살 무료예방접종 대상자가 아닙니다");
//	}
//		
//		scanner.close();
//		
//	}
//		
//		}
//[Ex10.java]
//두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 2개를 입력해주세요.");
//		
//		System.out.println("숫자1:");
//		int num1 = scanner.nextInt();
//		System.out.println("숫자2:");
//		int num2 = scanner.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println("큰수 :" + num1 + "작은수 : " + num2);
//		} else {
//			System.out.println("큰수 : "+ num2 + " 작은수 : " + num1);
//			
//			
//		}
//		scanner.close();
//	}
//
//}
//[Ex11.java]
//두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_11 {
//
//	public static void main(String[] args) {
//	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자 : ");
//		int num1 = scanner.nextInt();
//		System.out.println("두번째 숫자 : ");
//		int num2 = scanner.nextInt();
//		
//		int large,small;
//		
//		if (num1 > num2) { 
//			large = num1;
//			small = num2;
//		} else {
//			large = num2;
//			small = num1;
//		}
//		int mok = large / small;
//		int namuge = large % small;{
//		System.out.println("몫 : " + mok);
//		System.out.println("나머지:"+namuge);
//		}
//		
//			scanner.close();
//}}
//[Ex12.java]
//숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요	
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_12 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner =new Scanner(System.in);
//		
//		System.out.println("숫자 3개를 입력해주세요.");
//		System.out.println("숫자1:");
//		int num1 = scanner.nextInt();
//		System.out.println("숫자2:");
//		int num2 = scanner.nextInt();
//		System.out.println("숫자3:");
//		int num3 = scanner.nextInt();
//	
//		int small = num1;
//		
//		if (num2 < small) {
//			small = num2;
//		
//	}	if (num3 < small){
//			small = num3;
//	}	System.out.println("가장 작은 수는 "+small + "입니다.");
//
//	
//	
//		scanner.close();
//	}}
//		
	



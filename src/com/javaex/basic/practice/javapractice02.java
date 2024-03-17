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
//[Ex13.java]
//두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//(0은 입력하지 않습니다.)
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_13 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자:");
//		int a = scanner.nextInt();
//		System.out.println("두번째 숫자:");
//		int b = scanner.nextInt();
//		
//		int small;
//		int large;
//		
//		if (a > b) {
//			small = b;
//			large = a;
//		}else { 
//			small = a;
//			large = b;
//		}
//		
//		if (small !=0 && large % small == 0 ) {
//			System.out.println(small +"는 " + large +"의 약수입니다.");
//		} else {
//			System.out.println(large + "는 "+ small +"의 약수가 아닙니다.");
//		}
//		
//		scanner.close();
//	
//	}
//}
//[Ex14.java]
//사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
//⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//(사번 0은 고려하지 않습니다.)
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_14 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("사번을 입력해 주세요.");
//		System.out.print("사번 : ");
//		int sab = scanner.nextInt();
//		
//		if (sab > 0) {
//			int team = sab % 3;
//			String teamNo;
//			switch (team) {
//				case 0:
//				teamNo = "A팀";
//				break;
//				case 1: 
//				teamNo = "B팀";
//				break;
//				case 2: 
//				teamNo = "C팀";
//				break;
//				default : 
//				teamNo = " 팀 미정";
//				break;
//			}
//			System.out.println(teamNo+"입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//			scanner.close();
//		
//	}
//
//}
//[Ex15.java]
//아래와 같은 계산기 프로그램을 작성하세요.
//⚫ 기호, 숫자1, 숫자2 순서로 입력 받습니다.
//⚫ 기호는 ( + - * / ) 4가지 입니다.
//⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
//⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_15 {
//
//	public static void main(String[] args) {
//
//		System.out.println("출력되는 내용을 입력하세요.");
//		 Scanner scanner = new Scanner(System.in);
//
//	       
//	        System.out.print("기호: ");
//	        char cal = scanner.next().charAt(0); 
//	        System.out.print("숫자1: ");
//	        double num1 = scanner.nextDouble(); 
//	        System.out.print("숫자2: ");
//	        double num2 = scanner.nextDouble();
//
//	        double result;
//	        switch (cal) {
//	            case '+':
//	                result = num1 + num2;
//	                System.out.println("결과: " + result);
//	                break;
//	            case '-':
//	                result = num1 - num2;
//	                System.out.println("결과: " + result);
//	                break;
//	            case '*':
//	                result = num1 * num2;
//	                System.out.println("결과: " + result);
//	                break;
//	            case '/':
//	                if (num2 == 0) {
//	                    System.out.println("계산할 수 없습니다.");
//	                } else {
//	                    result = num1 / num2;
//	                    System.out.println("결과: " + result);
//	                }
//	                break;
//	            default:
//	                System.out.println("계산할 수 없는 기호입니다.");
//	        }
//
//	        scanner.close();
//	    
//	}
//
//}
//[Ex16.java]
//다음과 같이 정의되는 함수의 함수 값을 계산해보자
//𝒇(𝒙) = {
//𝒙
//𝟑 − 𝟗𝒙 + 𝟐 , 𝒙 ≤ 𝟎 (𝒙가 𝟎보다 작거나 같으면 이식을 사용)
//𝟕𝒙 + 𝟐 , 𝒙 > 𝟎 (𝒙가 𝟎보다 크면 이식을 사용)
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_16 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Scanner scanner = new Scanner(System.in);
//	     
//	        System.out.println("숫자를 입력해주세요. ");
//	        System.out.print("숫자: ");
//	        double x = scanner.nextDouble();
//	        double result;
//	        
//	        if (x <= 0) {
//	            result = x * x * x - 9 * x + 2;
//	        } else {
//	            result = 7 * x + 2;
//	        }
//
//	        System.out.println("계산 결과는" + result + "입니다.");
//
//	        scanner.close();
//	    
//	
//	}
//
//}
//[Ex17.java]
//다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
//⚫ 세금계산법
//⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
//⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
//⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
//⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_17 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("수익을 입력해주세요.");
//		System.out.print("금익:");
//		int money = scanner.nextInt();
//		
//		double tax;
//		if(money>0 && money <= 1000) {
//			tax = 0.09 * money;
//			System.out.println("소득세는"+ tax +"입니다.");
//		}else if (money>0 &&money <=4000) {
//			tax = 1000 * 0.09 + 0.18 * (money-1000);
//			System.out.println("소득세는"+ tax +"입니다.");
//		}else if (money >0 && money < 8000) {
//			tax = 1000*0.09 + 3000*0.18 + 0.27 * (money-4000);
//			System.out.println("소득세는"+ tax +"입니다.");
//		}else if (money>0&& money >= 8000){
//			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36 * (money-8000);
//			System.out.println("소득세는"+ tax +"입니다.");
//			}else{		
//			System.out.println("숫자를 잘못 입력하셨습니다.");
//		}
//		scanner.close();
//		}
//
//	}
//[Ex18.java]
//알파벳을 입력 받아 자음 모음을 구분하세요.
//⚫ switch~case문을 사용합니다.
//⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다

//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_18 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
//		System.out.print("알파벳:");
//		char alphabet = scanner.next().charAt(0);
//	
//		
//		switch(alphabet) {
//		
//		case 'a' :
//		case 'e' :
//		case 'i' :
//		case 'o' :
//		case 'u' :
//			System.out.println("모음입니다.");
//		break;
//		default:
//			System.out.println("자음입니다.");
//			break;
//		}
//		
//		scanner.close();
//		
//	}
//
//}
//[Ex19.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_19 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("태어난 년도를 입력해 주세요.");
//		System.out.print("년도:");
//		int birth =scanner.nextInt();
//		
//		int year = 2024;
//		int age = year - birth;
//		
//		if(age < 15 || age >=65) {
//			System.out.println(age + "살 무료 예방접종 대상자 입니다.");
//		}else {
//			System.out.println(age +"살 무료 예방접종 대상자가 아닙니다.");
//				
//			}
//		}
//		
//		
//		
//	}
//[Ex20.java]
//알파벳을 입력 받아 자음 모음을 구분하세요.
//⚫ if~else문을 사용합니다.
//⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_20 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner  = new Scanner(System.in);
//		
//		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
//		System.out.print("알파벳:");
//		char alphabet = scanner.next().charAt(0);
//		
//		if (alphabet>= 'a' && alphabet <='z') {
//		if (alphabet =='a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o'|| alphabet == 'u') {
//			System.out.println("모음입니다.");
//		}else  {
//			System.out.println("자음입니다.");
//			}
//		
//		}else {
//			System.out.println("소문자가 아닙니다.");
//		}
//		scanner.close();
//		
//	}
//	}
//사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램을 작성하세요.
//⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//⚫ 사번 0번을 입력하면 "잘못된 사번입니다." 라고 출력하세요.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_21 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("사번(정수)를 입력해주세요");
//		System.out.print("사번:");
//		int sabun = scanner.nextInt();
//		
//		if (sabun <=0) {
//			System.out.println("잘못된 사번입니다.");
//		} else {
//			int teamNo =sabun % 3;
//			
//		String team;
//		if(teamNo ==0) {
//			System.out.println("A팀입니다.");
//		}else if (teamNo == 1) {
//			System.out.println("B팀입니다.");
//		} else {
//			System.out.println("C팀입니다.");
//
//		}
//		}
//		
//	scanner.close();
//	}}
//[Ex22.java]
//숫자(정수) 3개를 입력 받아 가장 큰 수를 출력하세요
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_22 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//        System.out.println("세 개의 정수를 입력하세요:");
//        System.out.print("숫자1:");
//        int num1 = scanner.nextInt();
//        System.out.print("숫자2:");
//        int num2 = scanner.nextInt();
//        System.out.print("숫자3:");
//        int num3 = scanner.nextInt();
//        
//        int max = num1;
//        
//        if(num2 > max) {
//        	max = num2;
//        } 
//        if (num3 > max) {
//        	max = num3;}
//        
//        	System.out.println("가장 큰 수는 " + max +"입니다.");
//        	
//        	scanner.close();
//        }
//	}
//[Ex23.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
//⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
//(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.) 
//⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다
//
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java2_23 {
//
//	public static void main(String[] args) {
//
//		 Scanner scanner = new Scanner(System.in);
//
//	   
//	        System.out.println("태어난 년도를 입력해주세요.");
//	        System.out.print("년도: ");
//	        int birthYear = scanner.nextInt(); 
//	        int currentYear = 2024;
//	        System.out.println("올해: " + currentYear);
//	        int age = currentYear - birthYear;
//	        System.out.println("나이: "+ age);
//	        
//	        if (age < 20) {
//	           System.out.println("========================");
//	            System.out.println("20살 미만 건강검진 대상이 아님");
//	            }
//	            
//	            else {
//	                System.out.println("========================");
//	                System.out.println("20살 이상");
//	                if (currentYear % 2 == 0 && birthYear % 2 == 0) {
//	                    System.out.println("건강검진 해");
//	                } else {
//	                    System.out.println("건강검진해 아님");
//	                }
//
//	                if (age >= 40) {
//	                    System.out.println("암 검사");
//	                } else {
//	                    System.out.println("암 검사 x");
//	                }
//	            }
//
//	            scanner.close();
//	        }
//	    }








//package com.javaex.basic.practice;
//
//public class javapractice03 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//[Ex01.java]
//아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.
// while과 for를 이용한 루프를 확인할 수 있다.
//package com.javapractice;
//
//public class Java3_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("while문");
//		int index = 0;
//		while(index <3) {
//			System.out.println("index=" + index);
//			index++;
//		
//		}
//		System.out.println("for문");
//		for(int order=0; order <3; order++) {
//			System.out.println("order="+ order);
//		}
//	}
//
//}
//[Ex02.java]
//아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
//package com.javapractice;
//
//public class Java3_02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x,y;
//		for(x=0; x<4; x++) {
//			for(y=0; y<2; y++) {
//				System.out.print("*");
//			}
//			System.out.println("");		
//
//	}
//	}
//	}
//결과:
//	**
//	**
//	**
//	**
//[Ex03.java]
//아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.
//		package com.javapractice;
//
//		public class Java3_03 {
//
//			public static void main(String[] args) {
//				// TODO Auto-generated method stub
//				int x,y;
//				for(x=0; x<4; x++) {
//					for(y=2; y>=0; y--) {
//						System.out.print("*");
//					}
//					System.out.println("");		
//
//			}
//			}
//			}		
//결과:
//	***
//	***
//	***
//	***
//[Ex04.java]
//아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
//package com.javapractice;
//
//public class Java3_04 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1; i<5; i++) {
//			System.out.println(i);
//		}
//	System.out.println("===============");
//	
//	for(int i =10; i>0; i=i-2) {
//		System.out.println(i);
//	}
//	}
//
//}
//결과:
//1
//2
//3
//4
//===============
//10
//8
//6
//4
//2
//[Ex05.java]
//아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
//package com.javapractice;
//
//public class Java3_05 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int i=1;
//		boolean flag = true;
//		
//		while(flag) {
//			if(i >= 5) {
//				flag = false;
//			}
//			System.out.println(i);
//			i=i+1;
//		}
//	}
//
//}
//결과
//1
//2
//3
//4
//5
//[Ex06.java]
//1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
//package com.javapractice;
//
//public class Java3_06 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			
//		for (int i=1; i <=100; i++) {
//			if (i%5 == 0 && i%7 ==0) {
//				System.out.println(i);
//			}
//		}
//	}
//
//}
//[Ex07.java]
//숫자를 입력 받아 아래와 같이 출력하세요
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_07 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		int num = scanner.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			for (int j =1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		scanner.close();
//		
//	}
//
//}
//[Ex08.java]
//아래와 같이 구구단을 출력하세요
//package com.javapractice;
//
//public class Java3_08 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for(int i =2; i <=9; i++)
//			for (int j = 1; j<=9; j++) {
//				System.out.println(i + "*" + j+"=" +(i*j) );
//			}
//		System.out.println();
//			}
//	}
//[Ex09.java]
//다음과 같이 출력하세요
//package com.javapractice;
//
//public class Java3_09 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i =0; i <=9; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.print((i+j) + "\t");
//			}
//			System.out.println();
//		}
//
//	}
//
//}
//[Ex10.java]
//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		int max;
//		System.out.println("숫자를 입력하세요.");
//		System.out.println("숫자 : ");
//		int num1 = scanner.nextInt();
//		System.out.println("숫자 : ");
//		int num2 = scanner.nextInt();
//		System.out.println("숫자 : ");
//		int num3 = scanner.nextInt();
//		System.out.println("숫자 : ");
//		int num4 = scanner.nextInt();
//		System.out.println("숫자 : ");
//		int num5 = scanner.nextInt();
//		
//		max = num1;
//		
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }
//        if (num4 > max) {
//            max = num4;
//        }
//        if (num5 > max) {
//            max = num5;
//        }
//		System.out.println("가장 큰 수는 "+ max + "입니다.");
//		
//		scanner.close();
//		
//
//	}
//
//}
//[Ex11.java]
//다음과 같은 프로그램을 작성하세요
//a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
//- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
// - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_11 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		int num = scanner.nextInt();
//		
//		int sum = 0;
//		if(num %2 ==0) {
//			for(int i =2; i <= num; i+=2) {
//				sum += i;
//			}
//		}else {
//			for (int i = 1; i <=num; i +=2) {
//				sum +=i;
//			}
//		}
//		System.out.println("결과값:"+sum);
//		
//		scanner.close();
//	}
//	
//
//}
//[Ex12.java]
//팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력 받아 팩토리얼 값을 출력하세요.
//5 입력시 1*2*3*4*5 의 값이 출력됩니다.
//7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
//팩토리얼 공식 𝐧! = 𝟏 × 𝟐 × 𝟑 × ⋯ × �
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_12 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		int num = scanner.nextInt();
//		
//		int fac =1;
//		for (int i =num; i>0; i--) {
//			fac = fac*i;}
//		{System.out.println( "결과값:" +fac);
//		}
//
//		
//		scanner.close();
//	}
//}
//[
//Ex 13 .
//아래와 설명에 맞는 프로그램을 작성하세요
//숫자를 11개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요
//예를 들어 100100을 입력 받는다면 아래와 같이 계산됩니다
//𝟏 +𝟐+ 𝟑+ ... +𝟏𝟎𝟎
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_13 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요.:");
//		int n = scanner.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i<=n; i++)
//			sum += i;
//		System.out.println("합계:"+ sum);
//		
//		scanner.close();
//		
//
//
//	}
//
//}
//[
//Ex 14 .
//13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요 
// 1+2+...를 어떻게 출력하는지 모르겠어요.
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_14 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요.:");
//		int n = scanner.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i<=n; i++)
//			sum += i;
//		System.out.println("합계:"+ sum);
//		
//		scanner.close();
//		
//
//	}
//
//}
//[
//Ex 15 .
////아래와 설명에 맞는 프로그램을 작성하세요
////숫자를 11개 입력 받아 입력한 수의 약수를 모두 출력하세요
////예를 들어 1010을 입력한 경우 1, 2, 5, 10 이 출력된다
//package com.javapractice;
//
//import java.util.Scanner;
//
//public class Java3_15 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요.:");
//		int num = scanner.nextInt();
//	
//		for(int i =1; i <=num; i++) {
//			if(num % i == 0) {
//			
//				System.out.println(i+" ");
//			}
//		
//	
//		}
//		scanner.close();
//	}
//
//}
//[
//Ex 16 .
//아래와 설명에 맞는 프로그램을 작성하세요
//숫자를 11개 입력 받아 55의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
//예를 들어 2222을 입력한 경우 55의배수 개수 4, 5 5의배수 합 50 이 출력된다
//-
//55의배수 개수 : 5, 10, 15, 20  44개
//-
//55의배수 합 : 5+10+15+20  50







		


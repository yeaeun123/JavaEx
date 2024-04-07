package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		// 벡터 선언
		// 모든 객체(Object)를 담을 수 있는 컬렉션 객체
		// .elementAt 등 참조를 위해서 실제 클래스로 Casting 해야함
		
		Vector v = new Vector();	//기본 벡터 = 버퍼 용량 10(Capacity)
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//Size:0, Capacity:10

		for (int i = 0; i < 10; i++) {
			//요소 추가
			v.addElement(i);	// auto boxing
		}
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//Size:10, Capacity:10

		// 허용량 초과 해보기
		v.addElement(10);
		
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//Size:11, Capacity:20 ->버퍼의 크기가 10만큼 늘어남
		
		// 조회: elementAt 
		Integer val = (Integer)v.elementAt(5); //elementAt ->Object 리턴
		System.out.println(".elmentAt(5):" + val);
		//.elmentAt(5):5
		
		//역참조(검색)
		// 객체의 index 조회
		System.out.println(".indexOf(5):" + v.indexOf(5));
		//.indexOf(5):5
		System.out.println("indexOf(20):" + v.indexOf(20));
		//indexOf(20):-1 //  없는 객체: -1

		//객체 포함 여부 : .contains
		System.out.println(".contains(7):" + v.contains(7));
		//.contains(7):true
		System.out.println(".contains(20):" + v.contains(20));
		//.contains(20)false
		
		
		// 삭제 : .removeElement
		v.removeElement(7);

		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.println(item + " " ); //7삭제해서 7 제외하고 출력됨
			
		}
		// 컬렉션 프레임워크에서는 루프의 개선이 필요
		// TODO: 루프 방식 개선
		System.out.println();
		
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//Size:10, Capacity:20
		
		
		// 버퍼 비우기
		v.clear();
		System.out.println("v=" + v);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//Size:0, Capacity:20 // clear로 비우면 헤드가 처음으로 돌아감
		
		//Generic을 사용하여 코드 개선 가능
		// ex> Number를 상속한 모든 객체를 담을 수 있는 Genefic을 사용
//		Vector<Integer> v2 = new Vector<>(); 
		// vector안에 정수만 들어갈수있음/내부 데이터 타입 fix
		Vector<? super Number> v2 = new Vector<>();
		// Number 상속받은 클래스만 저장 (Short,Integer등)
		v2.addElement(Integer.valueOf(2024)); 
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("Vector"); // String은 Number를 상속 받지 않은 객체
		
		// TODO : 개선된 방식으로 루프 돌리기		
		
	}

}

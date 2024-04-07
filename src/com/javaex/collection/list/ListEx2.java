package com.javaex.collection.list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		
//		List l = new List(); 불가 -인터페이스라서 
		
		// List는 객체가 아니라 인터페이스 
		// 순서가 있다.
		// 중복 허용
		
		List<String> lst = new LinkedList<>();
//		List<String> lst = new ArrayList<>(); 
		
		
		// 객체 추가 : .add
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst = " + lst);

		// 객체 삽입
		lst.add(2,"C#");
		System.out.println("lst=" + lst);
		
		// List는 중복 삽입 허용
		lst.add("Java");
		System.out.println("lst=" + lst);
		
		System.out.println("Size: " + lst.size());
//		System.out.println("capacity: " lst.capacity()); 
		//list는 링크 연결이라서 캐퍼시티없음(벡터엔있음)
		
		// 삭제 : 인덱스 삭제
		lst.remove(2);
		// 객체 삭제
		lst.remove("Python");
		System.out.println("lst = " + lst);
		

		// Set, List 순회시에는 Iterator 객체 사용
		System.out.println("============Iterator");
		Iterator<String> it = lst.iterator(); // 반복자 추출
		
		while(it.hasNext()) { 	//뒤에 더 있음?
			String item = it.next();
			System.out.print(item + " ");
			
		}
		System.out.println();
		
		
		// 비우기
		lst.clear();
		System.out.println("lst= " + lst);
	}

}

package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;

class Student {
	// 필드
	int id; // 학생id
	String name; // 이름

	// 생성자
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// getters/setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// 객체의 동등성 비교를 위한 두 개의 관문
	// 1. hashCode()
	// 2. equals()
	@Override
	public int hashCode() {
		// 해시 함수의 로직: 학번을 기준으로
		return id;
	}

	// 값의 동일성 판별을 위한 equals 메서드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return id == other.id && name.equals(other.name);
		}
		return super.equals(obj);
	}

}
// 해시함수 -> 데이터같음=같은값 / 데이터다름=다른값
//hashset=집합 /순서 중요X/ 중복 X 
//hash -저장 & 빠른검색

public class HashSetEx {

	public static void main(String[] args) {
		// 1.HashSet 사용법(기본타입)
//		usingHashSet();

		// 2. 집합 연산
		setOperation();

		// 3. HashSet사용법 (객체 자료형)
//		usingHashSetWithCustom();
	}

	private static void usingHashSet() {
		// 선언
		HashSet<String> hs = new HashSet<>();

		// 요소 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");

		System.out.println("hs: " + hs);
		System.out.println("Size : " + hs.size());

		// 특정 객체 포함 여부
		System.out.println("C++ 포함? " + hs.contains("C++"));
		System.out.println("Linux 포함? " + hs.contains("Linux"));

		System.out.println("hs: " + hs);

		// 순서가 없음 : 객체로 삭제 하는 방법만 제공
		// 객체 삭제
		hs.remove("C++");
		System.out.println("hs : " + hs);

	}

	private static void setOperation() {
		// 집합 연산
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체 집합:" + numbers);
		HashSet<Integer> odds = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9)); // 홀수 집합
		System.out.println("홀수 집합: " + odds);
		HashSet<Integer> evens = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10)); // 짝수 집합
		System.out.println("짝수 집합: " + evens);
		HashSet<Integer> mTree = new HashSet<>(Arrays.asList(3, 6, 9)); // 3의 배수의 집합
		System.out.println("3의 배수 집합: " + mTree);

		// 교집합 : retainAll
		// 원본 보호를 위해 복제해서 사용
		System.out.println("=================교집합");
		HashSet<Integer> setA = (HashSet<Integer>) odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>) mTree.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);

		setA.retainAll(setB); // 집합 A 교집합 B = {3, 9}
		System.out.println("교집합: " + setA);
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3, 9))));

		// 합집합 : addAll
		System.out.println("===============합집합");
		setA = (HashSet<Integer>) odds.clone();
		setB = (HashSet<Integer>) evens.clone();

		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);

		setA.addAll(setB); // 집합 A 합집합 B =[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println("합집합 : " + setA);
		System.out.println(setA.equals(numbers));

		// 차집합 : removeAll
		System.out.println("==============차집합");
		setA = (HashSet<Integer>) numbers.clone();
		setB = (HashSet<Integer>) odds.clone();
		System.out.println("집합A: " + setA);
		System.out.println("집합B: " + setB);

		setA.removeAll(setB); // 잡합A - 집합B
		System.out.println("차집합: " + setA);
		System.out.println(setA.equals(evens));

	}
//hash 두 객체가 동등한지 확인-> hashcode 메서드는 객체의 메모리번지이용/모두 다른 값
	//		->1. hashcode override 2.equals override 두개다 통과해야 동등객체 가능
	private static void usingHashSetWithCustom() {
		
		HashSet<Student> hs = new HashSet<>();

		Student s1 = new Student(10, "홍길동");
		Student s2 = new Student(20, "홍길동");
		Student s3 = new Student(30, "고길동");
		Student s4 = new Student(30, "고길동");
		// 고길동은 다른객체지만 동등객체로 볼수있게 한다.
		// s3와 s4가 이름도 같고 학번도 같으니
		// 두 객체를 동등 객체로 판정하는 로직을 만들어야함

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);

		System.out.println("학생부 : " + hs);

	}
}

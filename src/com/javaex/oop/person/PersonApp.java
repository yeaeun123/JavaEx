package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("정우성",45,"서울고등학교");
		s1.showInfo();
		
		Student s2 = new Student("이정재",45,"한국고등학교");
		s2.showInfo();

	}

}

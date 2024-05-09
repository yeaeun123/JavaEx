package com.javaex.jdbc.hrsalary;

public class SalaryVO {

	/*
	 * [실습 3] 급여 검색 프로그램 작성
: 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원
의 정보를 출력하는 프로그램을 작성해 봅시다
 정렬은 salary 오름차순입니다
 HRSalary 프로젝트의 HRSalary 클래스에서 실행되어야 합니다
 결과 예시
2000 10000
============================================================
Kevin Freeney 3000
Donald Oconnell 4000
Pat Fay 90000
	 */
	
	private String firstName;
	private String lastName;
	private Long salary;
	private Long keyword;
	private int maxSalary;
	private int minSalary;
	
	
	public int getMaxSalary() {
		return maxSalary;
	}



	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}



	public int getMinSalary() {
		return minSalary;
	}



	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}



	public Long getKeyword() {
		return keyword;
	}



	public void setKeyword(Long keyword) {
		this.keyword = keyword;
	}



	public SalaryVO(String firstName, String lastName, Long salary, Long keyword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.keyword = keyword;
	}



	public SalaryVO() {
	
	}



	public SalaryVO(String firstName, String lastName, Long salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "SalaryVO [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	
}

package com.javaex.jdbc.daopractice;

public class EmployeeVO {
/*
 * [실습] 사원 정보 검색 프로그램 (DAO 버전)
: 클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로
그램을 작성해 봅시다
 부분 이름 검색이 가능해야 합니다
 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다
 출력 사원 정보는 이름 성, Email, 전화번호, 입사일,월급 입니다
 HRApp 프로젝트에서 HRMain Class에 main 메서드가 있어야 합니다
 */
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private Long salary;
	private String keyword;
	public EmployeeVO() {
		
	}

	public EmployeeVO(String firstName, String lastName, String email, String phoneNumber, String hireDate,
			Long salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}



	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", hireDate=" + hireDate + ", salary=" + salary + "]";
	}
}

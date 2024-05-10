package com.javaex.jdbc.miniproject;

public class PhoneBookVO {

	private int listInfo; //pk
	private String insertName;
	private String insertPhone;
	private String insertHomeNumber;
	
	
	public PhoneBookVO() {
	
	}
	public PhoneBookVO(int list, String insertName, String insertPhone, String insertHomeNumber) {
		super();
		this.listInfo = list;
		this.insertName = insertName;
		this.insertPhone = insertPhone;
		this.insertHomeNumber = insertHomeNumber;
	}
	
	
	public PhoneBookVO(String insertName, String insertPhone, String insertHomeNumber) {
		super();
		this.insertName = insertName;
		this.insertPhone = insertPhone;
		this.insertHomeNumber = insertHomeNumber;
	}
	public int getList() {
		return listInfo;
	}
	public void setList(int list) {
		this.listInfo = list;
	}
	public String getInsertName() {
		return insertName;
	}
	public void setInsertName(String insertName) {
		this.insertName = insertName;
	}
	public String getInsertPhone() {
		return insertPhone;
	}
	public void setInsertPhone(String insertPhone) {
		this.insertPhone = insertPhone;
	}
	public String getInsertHomeNumber() {
		return insertHomeNumber;
	}
	public void setInsertHomeNumber(String insertHomeNumber) {
		this.insertHomeNumber = insertHomeNumber;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [list=" + listInfo + ", insertName=" + insertName + ", insertPhone=" + insertPhone
				+ ", insertHomeNumber=" + insertHomeNumber + "]";
	}
	
	
}

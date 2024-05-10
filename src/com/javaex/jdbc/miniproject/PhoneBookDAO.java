package com.javaex.jdbc.miniproject;

import java.util.List;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getList();
	public PhoneBookVO get(int listInfo);
	public boolean addBook(PhoneBookVO phoneBookVo);
	public boolean deleteBook(int listInfo);
	public boolean insert(PhoneBookVO vo);
	
	
	
	


}

package com.javaex.jdbc.daopractice;

import java.util.List;

public interface EmployeeDAO {

	public List<EmployeeVO> getList();
	public List<EmployeeVO> get(String keyword);
	
}

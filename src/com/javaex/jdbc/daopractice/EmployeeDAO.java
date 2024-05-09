package com.javaex.jdbc.daopractice;

import java.util.List;

public interface EmployeeDAO {

	public List<EmployeeVO> getList();
	public EmployeeVO get(String str);
	
}

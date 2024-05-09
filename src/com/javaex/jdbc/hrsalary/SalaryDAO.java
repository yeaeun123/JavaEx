package com.javaex.jdbc.hrsalary;

import java.util.List;

public interface SalaryDAO {
	
	public List<SalaryVO> getList();
	public SalaryVO get(String str);
	SalaryVO get(int minSalary, int maxSalary);

}

package com.javaex.jdbc.hrname;

import java.util.List;

public interface EmployeeDAO {
	List<EmployeeVO> getList();
    EmployeeVO get(String firstName, String lastName);
    EmployeeVO get(String keyword);
}

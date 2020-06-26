package com.mybatis.mapper;

import com.mybatis.bean.Employees;
import java.util.List;

public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employees record);

    Employees selectByPrimaryKey(Integer employeeId);

    List<Employees> selectAll();

    int updateByPrimaryKey(Employees record);
}
package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
	private EmployeeRepository repo;
	@Override
	public boolean saveEmployee(Employee e) {
		Employee emp=repo.save(e);
		return (emp!=null)?true:false;
	}

}

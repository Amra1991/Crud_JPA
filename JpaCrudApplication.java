package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entity.Employee;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.IEmployeeService;

@SpringBootApplication
public class JpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpaCrudApplication.class, args);
	    IEmployeeService service=context.getBean(EmployeeServiceImpl.class);
        Employee emp=new Employee(101,"Amu","3000");
     
        boolean status=service.saveEmployee(emp);
        if(status)
        	System.out.println("data inserted");
        else
        	System.out.println("data not inserted");
	}

}

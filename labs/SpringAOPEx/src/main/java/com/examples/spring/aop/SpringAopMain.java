package com.examples.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.spring.aop.service.EmployeeService;

public class SpringAopMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println("Name: " + employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("Kumar");
		System.out.println("Name: " + employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("Anbu");
		employeeService.getEmployee().throwException();
		ctx.close();
	}
}

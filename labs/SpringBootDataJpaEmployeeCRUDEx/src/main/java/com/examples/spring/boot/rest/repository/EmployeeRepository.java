package com.examples.spring.boot.rest.repository;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examples.spring.boot.rest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByDepartment(String department);
	
	// Derived Query
	public List<Employee> findByDepartmentAndCountry(String department, String country);
		
	@Query("select e from Employee e where e.department = :department")
	public List<Employee> findByDeptQuery(@Param("department") String department);
	
	public List<Employee> findByDepartmentAndDesignation(String department, String designation);
}

package com.imaginnovate.EmployeeSalaryDetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.EmployeeSalaryDetails.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

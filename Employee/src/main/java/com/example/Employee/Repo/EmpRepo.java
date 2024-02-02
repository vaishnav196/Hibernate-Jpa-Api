package com.example.Employee.Repo;

import com.example.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
}

package com.example.Employee.EmployServcie;

import com.example.Employee.Repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    EmpRepo Erepo;

}

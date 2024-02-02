package com.example.Employee.Controller;

import com.example.Employee.Repo.EmpRepo;
import com.example.Employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    EmpRepo Erepo;



    @PostMapping("/Employee")
    public Employee CreEmployee( @RequestBody Employee emp){
        Erepo.save(emp);
        return emp;
    }


    // Read Emp
    @GetMapping("/Employees")
    public List<Employee>getEmployee(){
        List<Employee> Emps=Erepo.findAll();
        return  Emps;

    }

    @GetMapping("/Employees/{eid}")
    public Employee getEmployee(@PathVariable("eid") int Eid){
        Employee Emps=Erepo.findById(Eid).orElse(new Employee());
        return  Emps;

    }

// update emp
 @PutMapping("/Employee")
    public Employee updateEmploye(@RequestBody Employee updatedEmp){

    Erepo.save(updatedEmp);
    return updatedEmp;
 }

// Delete emp

    @DeleteMapping("/Employee/{eid}")
    public   Optional<Employee> deleteEmp (@PathVariable("eid") int Eid){
        Optional<Employee> emp=Erepo.findById(Eid);
        Erepo.deleteById(Eid);
    return emp;

    }



//    @Autowired
//    EmpRepo Erepo;
    // create emp
//@PostMapping("/Employee")
//public Employee CreEmployee( @RequestBody Employee emp){
//  Erepo.save(emp);
//    return emp;
//    }

    // Read Emp
//    @GetMapping("/Employees")
//    public List<Employee>getEmployee(){
//        List<Employee> Emps=Erepo.findAll();
//        return  Emps;
//
//    }

//    @GetMapping("/Employees/{eid}")
//    public Employee getEmployee(@PathVariable("eid") int Eid){
//        Employee Emps=Erepo.findById(Eid).orElse(new Employee());
//        return  Emps;
//
//    }


    // update emp
//    @PutMapping("/Employee")
//    public Employee updateEmploye(@RequestBody Employee updatedEmp){
//
//        Erepo.save(updatedEmp);
//        return updatedEmp;
//    }

    // Delete emp

//    @DeleteMapping("/Employee/{eid}")
//    public   Optional<Employee> deleteEmp (@PathVariable("eid") int Eid){
//        Optional<Employee> emp=Erepo.findById(Eid);
//        Erepo.deleteById(Eid);
//        return emp;
//
//    }



}

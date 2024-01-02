package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.EmployeeNotFoundException;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

 @Autowired
 private EmployeeRepository employeeRepository;

 @Override
 public List<Employee> getAllEmployees() {
     return employeeRepository.findAll();
 }

 @Override
 public Employee getEmployeeById(Long id) {
     return employeeRepository.findById(id)
             .orElseThrow(() -> new EmployeeNotFoundException(id));
 }

 @Override
 public Employee createEmployee(Employee employee) {
     return employeeRepository.save(employee);
 }

 @Override
 public Employee updateEmployee(Long id, Employee updatedEmployee) {
     Employee existingEmployee = getEmployeeById(id);
     existingEmployee.setName(updatedEmployee.getName());
     existingEmployee.setPosition(updatedEmployee.getPosition());
     return employeeRepository.save(existingEmployee);
 }

 @Override
 public void deleteEmployee(Long id) {
     employeeRepository.deleteById(id);
 }
}

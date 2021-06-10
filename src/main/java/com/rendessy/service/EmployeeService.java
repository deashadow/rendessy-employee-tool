package com.rendessy.service;

import java.util.List;

import com.rendessy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;



public interface EmployeeService {
        List<Employee> getAllEmployees() ;
        void saveEmployee (Employee employee);
        Employee getEmployeeById ( long id);
        void deleteEmployeeById ( long id);
        Page<Employee> findPaginated ( int pageNo, int pageSize, String sortField, String sortDirection);
    }

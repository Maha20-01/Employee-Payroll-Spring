package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j   // ✅ ADD THIS
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public List<EmployeeDTO> getAll() {
        log.info("Fetching all employees");   // ✅ ADD
        return service.getAll();
    }

    @PostMapping("/create")
    public EmployeeDTO create(@RequestBody EmployeeDTO dto) {
        log.info("Creating employee: {}", dto);   // ✅ ADD
        return service.create(dto);
    }

    @GetMapping("/get/{id}")
    public EmployeeDTO getById(@PathVariable int id) {
        log.info("Fetching employee with id: {}", id);   // ✅ ADD
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public EmployeeDTO update(@PathVariable int id, @RequestBody EmployeeDTO dto) {
        log.info("Updating employee with id: {}", id);   // ✅ ADD
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        log.info("Deleting employee with id: {}", id);   // ✅ ADD
        service.delete(id);
        return "Deleted";
    }
}
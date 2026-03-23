package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<EmployeeDTO> list = new ArrayList<>();

    // GET ALL
    public List<EmployeeDTO> getAll() {
        return list;
    }

    // GET BY ID
    public EmployeeDTO getById(int id) {
        if (id >= 0 && id < list.size()) {
            return list.get(id);
        }
        return null;
    }

    // CREATE
    public EmployeeDTO create(EmployeeDTO dto) {
        list.add(dto);
        return dto;
    }

    // UPDATE
    public EmployeeDTO update(int id, EmployeeDTO dto) {
        if (id >= 0 && id < list.size()) {
            list.set(id, dto);
            return dto;
        }
        return null;
    }

    // DELETE
    public void delete(int id) {
        if (id >= 0 && id < list.size()) {
            list.remove(id);
        }
    }
}
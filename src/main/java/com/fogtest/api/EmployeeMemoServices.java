package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeMemoServices {

    private EmployeeMemoRepository employeeMemoRepository;

    @Autowired
    public EmployeeMemoServices(EmployeeMemoRepository employeeMemoRepository){
        super();
        this.employeeMemoRepository = employeeMemoRepository;
    }

    public List<EmployeeMemo> getAllEmployeeMemos(){
        List<EmployeeMemo> employeeMemos = new ArrayList<>();
        this.employeeMemoRepository.findAll().forEach(employeeMemos::add);
        return employeeMemos;
    }
}

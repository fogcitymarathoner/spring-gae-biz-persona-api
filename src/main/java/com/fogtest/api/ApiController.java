package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private com.fogtest.api.ClientServices clientServices;
    private com.fogtest.api.ContractServices contractServices;

    private com.fogtest.api.EmployeeServices employeeServices;

    @Autowired
    public ApiController(com.fogtest.api.ClientServices clientServices,
                         com.fogtest.api.ContractServices contractServices,
                         com.fogtest.api.EmployeeServices employeeServices){
        super();
        this.clientServices = clientServices;
        this.contractServices = contractServices;
        this.employeeServices = employeeServices;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return this.clientServices.getAllClients();
    }

    @GetMapping("/contracts")
    public List<Contract> getAllContracts(){
        return this.contractServices.getAllContracts();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeServices.getAllEmployees();
    }
}

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
    private com.fogtest.api.ClientCheckServices clientCheckServices;
    private com.fogtest.api.ContractServices contractServices;
    private com.fogtest.api.EmployeeServices employeeServices;
    private com.fogtest.api.StateServices stateServices;

    @Autowired
    public ApiController(com.fogtest.api.ClientServices clientServices,
                         com.fogtest.api.ClientCheckServices clientCheckServices,
                         com.fogtest.api.ContractServices contractServices,
                         com.fogtest.api.EmployeeServices employeeServices,
                         com.fogtest.api.StateServices stateServices){
        super();
        this.clientServices = clientServices;
        this.clientCheckServices = clientCheckServices;
        this.contractServices = contractServices;
        this.employeeServices = employeeServices;
        this.stateServices = stateServices;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return this.clientServices.getAllClients();
    }

    @GetMapping("/clientschecks")
    public List<ClientCheck> getAllClientChecks(){
        return this.clientCheckServices.getAllClientChecks();
    }

    @GetMapping("/contracts")
    public List<Contract> getAllContracts(){
        return this.contractServices.getAllContracts();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeServices.getAllEmployees();
    }

    @GetMapping("/states")
    public List<State> getAllStates(){
        return this.stateServices.getAllStates();
    }
}

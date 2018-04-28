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
    private com.fogtest.api.ClientMemoServices clientMemoServices;
    private com.fogtest.api.ContractServices contractServices;
    private com.fogtest.api.ContractItemServices contractItemServices;
    private com.fogtest.api.ExpenseServices expenseServices;
    private com.fogtest.api.EmployeeServices employeeServices;
    private com.fogtest.api.EmployeeMemoServices employeeMemoServices;
    private com.fogtest.api.InvoiceServices invoiceServices;
    private com.fogtest.api.InvoiceItemServices invoiceItemServices;
    private com.fogtest.api.StateServices stateServices;

    @Autowired
    public ApiController(com.fogtest.api.ClientServices clientServices,
                         com.fogtest.api.ClientCheckServices clientCheckServices,
                         com.fogtest.api.ClientMemoServices clientMemoServices,
                         com.fogtest.api.ContractServices contractServices,
                         com.fogtest.api.ContractItemServices contractItemServices,
                         com.fogtest.api.ExpenseServices expenseServices,
                         com.fogtest.api.EmployeeServices employeeServices,
                         com.fogtest.api.EmployeeMemoServices employeeMemoServices,
                         com.fogtest.api.StateServices stateServices,
                         com.fogtest.api.InvoiceServices invoiceServices,
                         com.fogtest.api.InvoiceItemServices invoiceItemServices){
        super();
        this.clientServices = clientServices;
        this.clientCheckServices = clientCheckServices;
        this.clientMemoServices = clientMemoServices;
        this.contractServices = contractServices;
        this.contractItemServices = contractItemServices;
        this.expenseServices = expenseServices;
        this.employeeServices = employeeServices;
        this.employeeMemoServices = employeeMemoServices;
        this.stateServices = stateServices;
        this.invoiceServices = invoiceServices;
        this.invoiceItemServices = invoiceItemServices;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return this.clientServices.getAllClients();
    }

    @GetMapping("/clientschecks")
    public List<ClientCheck> getAllClientChecks(){
        return this.clientCheckServices.getAllClientChecks();
    }

    @GetMapping("/clientsmemos")
    public List<ClientMemo> getAllClientMemos(){
        return this.clientMemoServices.getAllClientMemos();
    }

    @GetMapping("/contracts")
    public List<Contract> getAllContracts(){
        return this.contractServices.getAllContracts();
    }

    @GetMapping("/contractitems")
    public List<ContractItem> getAllContractItems(){
        return this.contractItemServices.getAllContractItems();
    }

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return this.expenseServices.getAllExpenses();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeServices.getAllEmployees();
    }

    @GetMapping("/employeesmemos")
    public List<EmployeeMemo> getAllEmployeeMemos(){
        return this.employeeMemoServices.getAllEmployeeMemos();
    }
    @GetMapping("/states")
    public List<State> getAllStates(){
        return this.stateServices.getAllStates();
    }

    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices(){
        return this.invoiceServices.getAllInvoices();
    }

    @GetMapping("/invoices-items")
    public List<InvoiceItem> getAllInvoicesItems(){
        return this.invoiceItemServices.getAllInvoicesItems();
    }

}

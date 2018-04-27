package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ExpenseServices {
    private ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseServices(ExpenseRepository expenseRepository){
        super();
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses(){
        List<Expense> expenses = new ArrayList<>();
        this.expenseRepository.findAll().forEach(expenses::add);
        return expenses;
    }
}
package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private static List<Employee> employees = new ArrayList<>();

    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employees);
        return "employees";
    }
}



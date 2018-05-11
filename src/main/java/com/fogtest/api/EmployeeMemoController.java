package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employeesmemos")
public class EmployeeMemoController {

    private static List<EmployeeMemo> employeeMemos = new ArrayList<>();

    @GetMapping
    public String getAllEmployeeMemos(Model model){
        model.addAttribute("employeeMemos", employeeMemos);
        return "employees_memos_index";
    }
}

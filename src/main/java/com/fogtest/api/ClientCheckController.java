package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientschecks")
public class ClientCheckController {

    private static List<ClientCheck> clientChecks = new ArrayList<>();

    @GetMapping
    public String getAllClientChecks(Model model){
        model.addAttribute("clientChecks", clientChecks);
        return "clientchecks";
    }
}

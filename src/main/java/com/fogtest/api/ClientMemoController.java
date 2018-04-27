package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientsmemos")
public class ClientMemoController {

    private static List<ClientMemo> clientMemos = new ArrayList<>();

    @GetMapping
    public String getAllClientMemos(Model model){
        model.addAttribute("clientMemos", clientMemos);
        return "clientmemos";
    }
}

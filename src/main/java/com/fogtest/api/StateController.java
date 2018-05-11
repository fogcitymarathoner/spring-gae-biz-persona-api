package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/states")
public class StateController {

    private static List<State> states = new ArrayList<>();

    @GetMapping
    public String getAllStates(Model model){
        model.addAttribute("states", states);
        return "states_index";
    }
}

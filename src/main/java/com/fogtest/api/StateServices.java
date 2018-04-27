package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StateServices {
    private StateRepository stateRepository;

    @Autowired
    public StateServices(StateRepository stateRepository){
        super();
        this.stateRepository = stateRepository;
    }

    public List<State> getAllStates(){
        List<State> states = new ArrayList<>();
        this.stateRepository.findAll().forEach(states::add);
        return states;
    }
}

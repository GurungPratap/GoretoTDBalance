package com.microservices.tbalance.services;

import com.microservices.tbalance.model.Privilege;
import com.microservices.tbalance.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeSerivce {
    @Autowired
    private PrivilegeRepository privilegeRepository;

    public Privilege addPrivilege(Privilege privilege){
        return privilegeRepository.save(privilege);
    }

    public List<Privilege> getAllPrivilege(){
        return privilegeRepository.findAll();
    }
}

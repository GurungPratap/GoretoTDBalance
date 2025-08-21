package com.microservices.tbalance.services;

import com.microservices.tbalance.model.Users;
import com.microservices.tbalance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private Users addUser(Users user){
        return userRepository.save(user);
    }

    private void removeUser(long userId){
        userRepository.deleteById(userId);
    }
    private List<Users> getAllUser(){
        return userRepository.findAll();
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   @Autowired
   private UserRepository userRepository;

   public List<User> getAllUsers(){


       return userRepository.findAll();
   }

   public User getUserById(Long id){
       return userRepository.finfById(id);
   }

   public  User saveUser(User user){
       userRepository.save(user);
       return  user;
   }
}


package com.icodeap.apirest.service;

import com.icodeap.apirest.repository.UserRepository;
import com.icodeap.apirest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createsuser(User user){
        return userRepository.save(user);
    }

    public User getuserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUsers(List<Long> id){
        userRepository.deleteAllById(id);
    }

}

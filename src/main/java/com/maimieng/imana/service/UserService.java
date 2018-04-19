package com.maimieng.imana.service;

import com.maimieng.imana.entity.User;
import com.maimieng.imana.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User signUp(User user) {
        return repository.save(user);
    }

    public User signIn(User user) {
        User temp = repository.findByTelephone(user.getTelephone());
        if (!temp.getPassword().equals(user.getPassword())) {
            return null;
        }
        return temp;
    }

}

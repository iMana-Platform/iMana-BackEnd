package com.maimieng.imana.service.impl;

import com.maimieng.imana.entity.User;
import com.maimieng.imana.repository.UserRepository;
import com.maimieng.imana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User signUp(User user) {
        if (repository.findByTelephone(user.getTelephone()) == null) {
            return null;
        }
        return repository.save(user);
    }

    @Override
    public User signIn(User user) {
        User temp = repository.findByTelephone(user.getTelephone());
        if (!temp.getPassword().equals(user.getPassword())) {
            return null;
        }
        return temp;
    }
}

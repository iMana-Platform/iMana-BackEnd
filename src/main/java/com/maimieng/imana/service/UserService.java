package com.maimieng.imana.service;

import com.maimieng.imana.entity.User;

public interface UserService {

    User signUp(User user);

    User signIn(User user);

}

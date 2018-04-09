package com.maimieng.imana.repository;

import com.maimieng.imana.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Integer>,
                                        JpaSpecificationExecutor<User> {

    User findByTelephone(String telephone);


}

package com.sapient.oms.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.oms.bean.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String name);
}

package com.ttmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttmanagement.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
        User getByUserName(String userName);
}

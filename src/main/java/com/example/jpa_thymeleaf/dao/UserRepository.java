package com.example.jpa_thymeleaf.dao;

import com.example.jpa_thymeleaf.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    void deleteById(Long id);
}

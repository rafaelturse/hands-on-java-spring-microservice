package com.turse.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turse.hruser.entities.User;

public interface UserRepositoriy extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

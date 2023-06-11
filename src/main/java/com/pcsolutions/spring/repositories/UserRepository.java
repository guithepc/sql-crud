package com.pcsolutions.spring.repositories;

import com.pcsolutions.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

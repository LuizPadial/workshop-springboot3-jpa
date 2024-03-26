package com.cursoSpringBoot.curso.repositories;

import com.cursoSpringBoot.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

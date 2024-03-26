package com.cursoSpringBoot.curso.repositories;

import com.cursoSpringBoot.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}

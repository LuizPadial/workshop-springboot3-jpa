package com.cursoSpringBoot.curso.repositories;

import com.cursoSpringBoot.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

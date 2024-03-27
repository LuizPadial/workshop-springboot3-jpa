package com.cursoSpringBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursoSpringBoot.curso.entities.OrderItem;
import com.cursoSpringBoot.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

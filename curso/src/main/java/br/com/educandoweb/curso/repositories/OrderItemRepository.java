package br.com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{


    
}
package br.com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{


    
}
package br.com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{


    
}
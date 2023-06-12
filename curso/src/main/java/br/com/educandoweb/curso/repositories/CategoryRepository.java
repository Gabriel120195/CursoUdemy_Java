package br.com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{


    
}
package diegoteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegoteste.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
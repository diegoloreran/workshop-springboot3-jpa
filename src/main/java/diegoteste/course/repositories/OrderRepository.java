package diegoteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegoteste.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

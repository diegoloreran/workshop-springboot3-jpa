package diegoteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegoteste.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

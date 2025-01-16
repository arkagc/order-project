package com.orderproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderproject.entity.OrderDetails;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetails, Long>{

}

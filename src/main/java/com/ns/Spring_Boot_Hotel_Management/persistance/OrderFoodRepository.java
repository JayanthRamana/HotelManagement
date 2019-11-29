package com.ns.Spring_Boot_Hotel_Management.persistance;


import com.ns.Spring_Boot_Hotel_Management.Model.OrderFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFoodRepository extends JpaRepository<OrderFood,Integer> {


}

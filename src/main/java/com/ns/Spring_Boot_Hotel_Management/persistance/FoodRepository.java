package com.ns.Spring_Boot_Hotel_Management.persistance;


import com.ns.Spring_Boot_Hotel_Management.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodRepository extends JpaRepository<Food,Integer> {
}

package com.ns.Spring_Boot_Hotel_Management.Controller;


import com.ns.Spring_Boot_Hotel_Management.Model.OrderFood;
import com.ns.Spring_Boot_Hotel_Management.persistance.OrderFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/orderfoods")

public class OrderFoodController {


    @Autowired
    OrderFoodRepository orderFoodRepository;



    @PostMapping()
    public OrderFood[] addfooditem(@RequestBody OrderFood[] orderFood) {
        for (int i = 0; i < orderFood.length; i++) {

            orderFoodRepository.save(orderFood[i]);
        }
        return orderFood;
    }

    @GetMapping()
    public List<OrderFood> vieworder() {
        List<OrderFood> food = new ArrayList<>();
        orderFoodRepository.findAll().forEach(food::add);
        return food;
    }


}

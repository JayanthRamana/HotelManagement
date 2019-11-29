package com.ns.Spring_Boot_Hotel_Management.Controller;




import com.ns.Spring_Boot_Hotel_Management.Model.Food;
import com.ns.Spring_Boot_Hotel_Management.persistance.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    FoodRepository foodRepository;


    @PostMapping()
    public Food addfood(@RequestBody Food food) {
        Food s = foodRepository.save(food);
        return s;
    }

    @GetMapping()
    public List<Food> getAllfoods() {
        List<Food> viewfood = new ArrayList<>();
        foodRepository.findAll().forEach(viewfood::add);
        return viewfood;
    }


}













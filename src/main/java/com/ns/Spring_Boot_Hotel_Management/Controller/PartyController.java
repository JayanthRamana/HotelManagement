package com.ns.Spring_Boot_Hotel_Management.Controller;

import com.ns.Spring_Boot_Hotel_Management.Model.Party;
import com.ns.Spring_Boot_Hotel_Management.persistance.PartyHallRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/partyhalls")
public class PartyController {

    @Autowired
    PartyHallRepsitory partyHallRepsitory;


    @PostMapping()
    public Party newuser(@RequestBody Party party) {

        Party hall = partyHallRepsitory.save(party);
        return hall;
    }





















}

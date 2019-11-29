package com.ns.Spring_Boot_Hotel_Management.persistance;


import com.ns.Spring_Boot_Hotel_Management.Model.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyHallRepsitory extends JpaRepository<Party, Integer> {

}

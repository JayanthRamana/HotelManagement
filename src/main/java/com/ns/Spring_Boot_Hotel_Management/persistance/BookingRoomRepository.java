package com.ns.Spring_Boot_Hotel_Management.persistance;


import com.ns.Spring_Boot_Hotel_Management.Model.BookingRoom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRoomRepository extends JpaRepository<BookingRoom,String> {


}

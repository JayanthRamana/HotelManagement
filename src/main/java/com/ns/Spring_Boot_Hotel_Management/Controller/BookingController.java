package com.ns.Spring_Boot_Hotel_Management.Controller;



import com.ns.Spring_Boot_Hotel_Management.Model.BookingRoom;
import com.ns.Spring_Boot_Hotel_Management.persistance.BookingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/rooms")
public class BookingController {

    @Autowired
    BookingRoomRepository bookingRoomRepository;



    @PostMapping()
    public BookingRoom newuser(@RequestBody BookingRoom bookingRoom) {
        BookingRoom room = bookingRoomRepository.save(bookingRoom);
        return room;
    }

    @GetMapping()
    public List<BookingRoom> getAllRooms() {
        List<BookingRoom> viewroom = new ArrayList<>();
        bookingRoomRepository.findAll().forEach(viewroom::add);
        System.out.println(viewroom);
        return viewroom;
    }

    @DeleteMapping("/{roomid}")
    public void deleteroomid(@PathVariable("roomid") String id) {
        System.out.println(id);
        bookingRoomRepository.deleteById(id);
    }
}

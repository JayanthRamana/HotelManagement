package com.ns.Spring_Boot_Hotel_Management.Controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns.Spring_Boot_Hotel_Management.Model.Register;
import com.ns.Spring_Boot_Hotel_Management.exception.RecordNotFoundException;
import com.ns.Spring_Boot_Hotel_Management.persistance.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class RegisterController {

    @Autowired
    RegisterRepository registerRepository;


//    @PostMapping("/create")
//    public Register newcustomer(@RequestBody Register register) {
//
//        registerRepository.save(register);
//        return register;
//    }

    @PostMapping("/create")
    public  Register newcustomer(@RequestParam("image") MultipartFile file,@RequestParam("data") String data )throws IOException {

        Register userdata=new ObjectMapper().readValue(data,Register.class);
        userdata.setImage(file.getBytes());
        registerRepository.save(userdata);
        return  userdata;
    }




    @PostMapping("/login")
    public Register getCustomers(@RequestParam Map<String, String> allParams)  throws Exception {
        Optional<Register> user = registerRepository.findByName(allParams.get("name"));
        System.out.println(user);
        if (user.isPresent()) {
            if (user.get().getPassword().equals(allParams.get("password"))) {
                user.get().setCode(101);
                return user.get();
            } else {
                user.get().setCode(102);
                System.out.println("  sdsaf : " + user.get());
                return user.get();
            }
        } else {
           throw new  RecordNotFoundException("User  does not  exist");
        }
    }

    @PostMapping("/forgotpassword")
    public void changecustomer(@RequestBody Register register) {
        registerRepository.findByEmail(register.getConfirmpassword(), register.getEmail());
    }


}

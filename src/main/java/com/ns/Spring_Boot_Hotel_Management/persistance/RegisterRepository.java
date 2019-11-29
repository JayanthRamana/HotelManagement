package com.ns.Spring_Boot_Hotel_Management.persistance;

import com.ns.Spring_Boot_Hotel_Management.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface RegisterRepository extends JpaRepository<Register, Integer> {
    Optional<Register> findByName(String name);



    @Modifying
    @Transactional
    @Query(value = "update add_user set password=?1 where email=?2", nativeQuery = true)

    public void findByEmail(String confirmpassword, String email);


}

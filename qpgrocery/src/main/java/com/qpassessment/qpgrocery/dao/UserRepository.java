package com.qpassessment.qpgrocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qpassessment.qpgrocery.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
<<<<<<< HEAD
<<<<<<< Updated upstream
	//sout hello
=======
    //as
>>>>>>> Stashed changes
=======
>>>>>>> 275a85ef61b90e1cf3d74586d5e425ac726d3d3d
}

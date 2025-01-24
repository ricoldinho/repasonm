package edu.customcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.customcar.entities.Motor;

public interface MotoresRepository extends JpaRepository<Motor, Long> {

}

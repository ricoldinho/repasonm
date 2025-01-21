package edu.customcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.customcar.entities.Coche;

public interface CochesRepository extends JpaRepository<Coche, Long> {

}

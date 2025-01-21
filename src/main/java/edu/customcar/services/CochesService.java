package edu.customcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.customcar.entities.Coche;
import edu.customcar.repositories.CochesRepository;

@Service
public class CochesService implements ICochesService {
    @Autowired
    private CochesRepository cochesRepository;
    
    @Override
    public List<Coche> getCochesList() {
       return cochesRepository.findAll();
    }

}

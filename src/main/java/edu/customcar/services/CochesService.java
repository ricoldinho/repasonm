package edu.customcar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.customcar.entities.Coche;
import edu.customcar.repositories.CochesRepository;
import jakarta.transaction.Transactional;

@Service
public class CochesService implements ICochesService {
    @Autowired
    private CochesRepository cochesRepository;
    
    @Override
    public List<Coche> getCochesList() {
    
       return cochesRepository.findAll();
    }

    @Override
    public Coche getCocheById(Long id) {
        Optional<Coche> op = cochesRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        System.out.println("NO EXISTE ID EN LA BASE DE DATOS");
        return null;
    }

    @Transactional
    public Coche deleteCocheById(Long id) {
        Optional<Coche> op = cochesRepository.findById(id);
        if(op.isPresent()){
            cochesRepository.deleteById(id);
            return op.get();
        }
        return null;
    }


    @Transactional
    public Coche updateCocheById(Coche coche) {
        if(cochesRepository.existsById(coche.getId())){
            return cochesRepository.save(coche);
        }
        return null;
    }

    @Transactional
    public Coche saveCoche(Coche coche){
            return cochesRepository.save(coche);
    }

    

}

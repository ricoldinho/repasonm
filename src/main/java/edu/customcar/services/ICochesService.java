package edu.customcar.services;

import java.util.List;

import edu.customcar.entities.Coche;

public interface ICochesService {

    public List<Coche> getCochesList();
    public Coche getCocheById(Long id);
    public Coche deleteCocheById(Long id);
    public Coche updateCocheById(Coche coche);
    public Coche saveCoche(Coche coche);

}

package edu.customcar.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.customcar.entities.Coche;
import edu.customcar.services.ICochesService;

@RestController
@RequestMapping("/coches")
public class CochesRestController {

    @Autowired
    private ICochesService cochesService;

    @GetMapping("/cochesList")
    private List<Coche> cochesList(){

        return cochesService.getCochesList();
    }

}

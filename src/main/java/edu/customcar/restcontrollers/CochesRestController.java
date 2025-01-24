package edu.customcar.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.customcar.entities.Coche;
import edu.customcar.services.ICochesService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/coches")
public class CochesRestController {

    @Autowired
    private ICochesService cochesService;

    @GetMapping("/cochesList")
    public List<Coche> cochesList(){

        return cochesService.getCochesList();
    }

    @GetMapping("/{id}")
    public Coche getCocheById(@PathVariable("id") Long id){
      return cochesService.getCocheById(id);
    }

    @DeleteMapping("/{id}")
    public Coche deleteCocheById(@PathVariable("id") Long id){
        return cochesService.deleteCocheById(id);
    }

    @PutMapping("/actualizar")
    public Coche actualizarCochePorId(@RequestBody Coche coche) {
        return cochesService.updateCocheById(coche);
    }

    @PostMapping("/guardar")
    public Coche guardarCoche(@RequestBody Coche coche) {
        return cochesService.saveCoche(coche);
    }
    
//https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html
}

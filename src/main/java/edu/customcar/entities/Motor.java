package edu.customcar.entities;

import java.util.LinkedList;

import edu.customcar.entities.enumerated.Combustible;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "motores")
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fabricante", nullable = false, length = 50)
    private String fabricante;
    @Column(name = "cilindrada", nullable = false)
    private Integer cilindrada;
    @Column(name = "potencia", nullable = false)
    private Integer potencia;
    @Column(name = "combustible", nullable = false, columnDefinition = "ENUM('GAS', 'DIESEL', 'ELECTRIC', 'HYBRID', 'JASOE')")
    @Enumerated(EnumType.STRING)
    private Combustible combustible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "motor")
    private LinkedList<Coche> cochesList;

    public Motor() {
    }

    public Motor(Long id, String fabricante, Integer cilindrada, Integer potencia, Combustible combustible) {
        this.id = id;
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.combustible = combustible;
    }

    

    public Motor(Long id, String fabricante, Integer cilindrada, Integer potencia, Combustible combustible,
            LinkedList<Coche> cochesList) {
        this.id = id;
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.combustible = combustible;
        this.cochesList = cochesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public LinkedList<Coche> getCochesList() {
        return cochesList;
    }

    public void setCochesList(LinkedList<Coche> cochesList) {
        this.cochesList = cochesList;
    }

    @Override
    public String toString() {
        return "Motor [id=" + id + ", fabricante=" + fabricante + ", cilindrada=" + cilindrada + ", potencia="
                + potencia + ", combustible=" + combustible + ", cochesList=" + cochesList + "]";
    }

    

    
    

}

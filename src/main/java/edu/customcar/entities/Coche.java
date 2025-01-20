package edu.customcar.entities;

import java.util.LinkedList;

import edu.customcar.entities.enumerated.Tipo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "coches")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca", nullable = false, length = 50)
    private String marca;
    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;
    @Column(name = "tipo", nullable = false, columnDefinition = "ENUM('COUPE', 'SEDAN', 'CONVERTIBLE', 'SUV', 'TRUCK', 'VAN', 'WAGON', 'TOURISM')")
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "motor_id")
    private Motor motor;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "coches_ruedas", joinColumns = @JoinColumn(name = "coche_id"), inverseJoinColumns = @JoinColumn(name = "rueda_id"))
    private LinkedList<Rueda> ruedasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coche")
    private LinkedList<Venta> ventasList;
    
    public Coche() {
    }

    public Coche(String marca, String modelo, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    

    public Coche(Long id, String marca, String modelo, Tipo tipo, Motor motor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.motor = motor;
    }

    

    public Coche(Long id, String marca, String modelo, Tipo tipo, Motor motor, LinkedList<Rueda> ruedasList) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.motor = motor;
        this.ruedasList = ruedasList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public LinkedList<Rueda> getRuedasList() {
        return ruedasList;
    }

    public void setRuedasList(LinkedList<Rueda> ruedasList) {
        this.ruedasList = ruedasList;
    }

    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", motor=" + motor
                + ", ruedasList=" + ruedasList + "]";
    }

   

    

    

}

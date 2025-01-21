package edu.customcar.entities;

import java.util.LinkedList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="dni", length=10, nullable=false)
    private String dni;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private LinkedList<Venta> ventasList;

    public Cliente(){}

    public Cliente(Long id, String dni) {
        this.id = id;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LinkedList<Venta> getVentasList() {
        return ventasList;
    }

    public void setVentasList(LinkedList<Venta> ventasList) {
        this.ventasList = ventasList;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", dni=" + dni + ", ventasList=" + ventasList + "]";
    }

    

    

}

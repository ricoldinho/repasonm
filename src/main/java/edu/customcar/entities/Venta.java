package edu.customcar.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "coche_id")
    @JsonIgnore
    private Coche coche;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_venta", nullable = false)
    private LocalDate fecha_venta;
    @Column(name = "precio", nullable = false)
    private Double precio;

    public Venta() {
    }

    public Venta(Cliente cliente, Coche coche, LocalDate fecha_venta, Double precio) {
        this.cliente = cliente;
        this.coche = coche;
        this.fecha_venta = fecha_venta;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Venta [id=" + id + ", cliente=" + cliente + ", coche=" + coche + ", fecha_venta=" + fecha_venta
                + ", precio=" + precio + "]";
    }

    

}

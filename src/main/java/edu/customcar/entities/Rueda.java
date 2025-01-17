package edu.customcar.entities;

import edu.customcar.entities.enumerated.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ruedas")
public class Rueda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca", nullable = false, length = 50)
    private String marca;
    @Column(name = "diametro", nullable = false)
    private Integer diametro;
    @Column(name = "ancho", nullable = false)
    private Integer ancho;
    @Column(name = "estado", nullable = false, columnDefinition = "ENUM('NUEVA', 'USADA', 'RECAUCHUTADA', 'GASTADA')")
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public Rueda() {
    }

    public Rueda(String marca, Integer diametro, Integer ancho, Estado estado) {
        this.marca = marca;
        this.diametro = diametro;
        this.ancho = ancho;
        this.estado = estado;
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

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rueda [id=" + id + ", marca=" + marca + ", diametro=" + diametro + ", ancho=" + ancho + ", estado="
                + estado + "]";
    }

    

}

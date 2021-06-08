package com.elecciones.entities;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@Table(name = "candidato")
@XmlRootElement
public class Candidato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "documento", length = 15)
    private String documento;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "apellido", length = 50)
    private String apellido;
    @Column(name = "numero")
    private Integer numero;
    @OneToMany(mappedBy = "candidato")
    private Collection<Voto> votoCollection;
    @JoinColumn(name = "eleccion", referencedColumnName = "id")
    @ManyToOne
    private Eleccion eleccion;

    public Candidato() {
    }

    public Candidato(Integer id) {
        this.id = id;
    }
}

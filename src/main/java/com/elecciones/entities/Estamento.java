package com.elecciones.entities;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "estamento")
@XmlRootElement
@Data
public class Estamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descripcion", length = 50)
    private String descripcion;
    @OneToMany(mappedBy = "estamento")
    private Collection<Voto> votoCollection;
    @JoinColumn(name = "eleccion", referencedColumnName = "id")
    @ManyToOne
    private Eleccion eleccion;

    public Estamento() {
    }

    public Estamento(Integer id) {
        this.id = id;
    }}



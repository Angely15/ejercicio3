package com.elecciones.entities;

import lombok.Data;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "votante")
@XmlRootElement
@Data
public class Votante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre", length = 100)
    private String nombre;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "documento", length = 20)
    private String documento;
    @JoinColumn(name = "eleccion", referencedColumnName = "id")
    @ManyToOne
    private Eleccion eleccion;
    @JoinColumn(name = "tipodocumento", referencedColumnName = "id")
    @ManyToOne
    private Tipodocumento tipodocumento;
    @OneToMany(mappedBy = "votante")
    private Collection<Voto> votoCollection;

    public Votante() {
    }

    public Votante(Integer id) {
        this.id = id;
    }}


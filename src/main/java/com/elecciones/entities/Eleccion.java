package com.elecciones.entities;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "eleccion")
@XmlRootElement
@Data
public class Eleccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre", length = 200)
    private String nombre;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Column(name = "cargo", length = 200)
    private String cargo;
    @OneToMany(mappedBy = "eleccion")
    private Collection<Votante> votanteCollection;
    @OneToMany(mappedBy = "eleccion")
    private Collection<Estamento> estamentoCollection;
    @OneToMany(mappedBy = "eleccion")
    private Collection<Candidato> candidatoCollection;
}

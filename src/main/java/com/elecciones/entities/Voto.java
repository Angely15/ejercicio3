package com.elecciones.entities;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "voto")
@XmlRootElement
@Data
public class Voto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechavoto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechavoto;
    @Column(name = "uuid", length = 50)
    private String uuid;
    @Column(name = "enlace", length = 50)
    private String enlace;
    @JoinColumn(name = "candidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato candidato;
    @JoinColumn(name = "estamento", referencedColumnName = "id")
    @ManyToOne
    private Estamento estamento;
    @JoinColumn(name = "votante", referencedColumnName = "id")
    @ManyToOne
    private Votante votante;

    public Voto() {
    }

    public Voto(Integer id) {
        this.id = id;
    }
}
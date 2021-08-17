package com.example.demospringjpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Clase entidad YpUser que pertenece a la tabla yp_user en la bdd
 *
 * @author fmtacuri
 */

@Entity
@Table(name = "yp_user")
@Data
@IdClass(YpUserId.class)
public class YpUser implements Serializable {

    private static final long serialVersionUID = -6448098974312524004L;

    @Id
    private Integer codigoEmpresa;

    @Id
    private String login;

    private String passwd;
    private int tipo;
    private BigDecimal caja;
    private Integer acceso;
    private String cadena;
    private int idruc;
    private String identificacion;
    private String nombre;
    private String email;
    private String codigo;
    private int periodop;
    private int enviado;
    private Timestamp datetry;

    @Basic(optional = false)
    @Column(name = "try")
    private int tryValue;

    private Integer codigoRol;
}

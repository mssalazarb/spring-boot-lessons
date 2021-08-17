package com.example.demospringjpa;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fmtacuri
 */

@Data
public class YpUserId implements Serializable {

    private static final long serialVersionUID = -2197213562379026988L;

    private Integer codigoEmpresa;
    private String login;
}

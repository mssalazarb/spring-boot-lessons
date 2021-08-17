package com.example.demospringjpa;

public class YpUserDTO {

    private String nombre;
    private String login;
    private String passwd;

    public YpUserDTO(String nombre, String login, String passwd) {
        this.nombre = nombre;
        this.login = login;
        this.passwd = passwd;
    }
}

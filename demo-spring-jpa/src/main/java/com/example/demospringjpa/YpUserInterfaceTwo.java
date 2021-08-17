package com.example.demospringjpa;

import org.springframework.beans.factory.annotation.Value;

public interface YpUserInterfaceTwo {

    @Value("#{'Bienvenido ' + target.nombre + ' con rol: ' + target.login}")
    String getInformation();
}

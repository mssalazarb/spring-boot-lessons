package com.example.demospringjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private UsuarioRepository repository;

    public List<YpUser> buscarTodos() {
        var response = repository.buscarTodos();
        response.forEach(dto -> {
            try {
                var metodo = dto.getClass().getDeclaredMethod("setLogin", String.class);
                metodo.setAccessible(true);
                metodo.invoke(dto, "Michael");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return response;
    }

    public List<YpUser> buscarPorParametros(String login) {
        return repository.buscarPorParametro(login);
    }

    public YpUser guardar(YpUser usuario) {
        return repository.save(usuario);
    }

    public List<YpUserInterfaceOne> buscarProyeccionUno() {
        return repository.buscarProyeccionGenerica(YpUserInterfaceOne.class);
    }

    public List<YpUserInterfaceTwo> buscarProyeccionDos() {
        return repository.buscarProyeccionGenerica(YpUserInterfaceTwo.class);
    }
}

package com.example.demospringjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private DemoService servicio;

    @GetMapping("/todos")
    public <T> List<T> consultarUsuarios(@RequestParam("metodo") String metodo) {
        try {
            var method = servicio.getClass().getDeclaredMethod(metodo, null);
            Object obj = method.invoke(servicio);

            return (List<T>) obj;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @GetMapping("/param")
    public List<YpUser> buscarPorParametros(@RequestParam("login") String login) {
        return servicio.buscarPorParametros(login);
    }

    @PostMapping("/guardar")
    public YpUser guardar(@RequestBody YpUser usuario) {
        return servicio.guardar(usuario);
    }
}

package com.example.demospringjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import static com.example.demospringjpa.sql.QuerysSQL.*;

@Repository
public interface UsuarioRepository extends JpaRepository<YpUser, YpUserId> {

    @Query(value = USUARIO_SELECT, nativeQuery = true)
    List<YpUser> buscarTodos();

    @Query(value = USUARIO_SELECT + USUARIO_WHERE, nativeQuery = true)
    List<YpUser> buscarPorParametro(@Param("login") String login);

    @Query(value = USUARIO_SELECT, nativeQuery = true)
    <T> List<T> buscarProyeccionGenerica(Class<T> clazz);
}

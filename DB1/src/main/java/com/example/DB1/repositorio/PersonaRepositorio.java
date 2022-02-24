package com.example.DB1.repositorio;


import com.example.DB1.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    Persona findById(int id_persona);

    @Query("select p from Persona p where p.usuario = ?1")
    List<Persona> findByUsuario(String user);
}

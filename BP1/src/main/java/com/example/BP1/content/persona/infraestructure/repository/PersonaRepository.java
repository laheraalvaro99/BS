package com.example.BP1.content.persona.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.BP1.content.persona.domain.Persona;
import com.example.BP1.content.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    public Persona findById(int id_persona);

    @Query("select p from Persona p where p.usuario = ?1")
    public List<Persona> findByUsuario(String user);
}

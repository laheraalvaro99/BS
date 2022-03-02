package com.example.BS8.persona.infraestructure.controller.dto;


import com.example.BS8.persona.application.service.PersonaServiceImpl;
import com.example.BS8.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PersonaController {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    @GetMapping("/getId/{id}")
    public PersonaOutputDto getId(@PathVariable int id) throws Exception {
        return personaServiceImpl.buscarPorId(id);
    }

    @GetMapping("/getUser/{user}")
    public List<PersonaOutputDto> getUser(@PathVariable String user) {
        return personaServiceImpl.buscarUsuario(user);
    }
}

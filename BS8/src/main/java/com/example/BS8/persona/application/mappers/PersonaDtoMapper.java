package com.example.BS8.persona.application.mappers;

import com.example.BS8.persona.domain.Persona;
import com.example.BS8.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Mapper(componentModel = "spring")
public interface PersonaDtoMapper {


    Persona personaOutputDtoToPersona(PersonaOutputDto personaOutputDto);

    PersonaOutputDto personaToPersonaOutput(Persona persona);
    Persona personaInputDtoToPersona(PersonaInputDto personaInputDto);

    PersonaInputDto personaToPersonaInputDto(Persona persona);
}

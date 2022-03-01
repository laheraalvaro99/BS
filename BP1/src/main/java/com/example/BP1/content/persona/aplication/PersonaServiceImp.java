package com.example.BP1.content.persona.aplication;

import com.example.BP1.content.persona.domain.Persona;
import com.example.BP1.content.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BP1.content.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import com.example.BP1.content.persona.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImp {
    @Autowired
    private PersonaRepository personaRepository;

    private PersonaOutputDto converToDto(Persona persona) {
        PersonaOutputDto personaOutputDto = new PersonaOutputDto();

        personaOutputDto.setId_persona(persona.getId_persona());
        personaOutputDto.setUsuario(persona.getUsuario());
        personaOutputDto.setPassword(persona.getPassword());
        personaOutputDto.setName(persona.getName());
        personaOutputDto.setSurname(persona.getSurname());
        personaOutputDto.setCompany_email(persona.getCompany_email());
        personaOutputDto.setPersonal_email(persona.getPersonal_email());
        personaOutputDto.setCity(persona.getCity());
        personaOutputDto.setActive(persona.getActive());
        personaOutputDto.setCreated_date(persona.getCreated_date());
        personaOutputDto.setImagen_url(persona.getImagen_url());
        personaOutputDto.setTermination_date(persona.getTermination_date());

        return personaOutputDto;
    }


    public List<PersonaOutputDto> getAll(){
        return personaRepository.findAll()
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

    public PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception {
        PersonaOutputDto personaOutputDto = new PersonaServiceImp().converToDto(personaInputDto.persona());
        if(personaInputDto.persona().getUsuario().length()>5){
            personaRepository.save(personaInputDto.persona());
            return personaOutputDto;
        }else {
            throw new Exception("Datos invalidos para aniadir a esta persona");
        }
    }

    public PersonaOutputDto deletePersona(int id) throws Exception {
        PersonaOutputDto personaOutputDto = new PersonaServiceImp().converToDto(personaRepository.findById(id));
        if(personaRepository.findById(id) != null){
            personaRepository.deleteById(id);
            return personaOutputDto;
        }else{
            throw new Exception("No existe el usuario");
        }
    }

    public PersonaOutputDto modifyPersona(int id, PersonaInputDto personaInputDto){
        Persona persona = personaRepository.findById(id);

        if (personaInputDto.persona().getUsuario() != null  && personaInputDto.persona().getName().length() >= 5){
            persona.setUsuario(personaInputDto.getUsuario());
        }
        if(personaInputDto.persona().getPassword() != null){
            persona.setPassword(personaInputDto.getPassword());
        }
        if(personaInputDto.persona().getName() != null){
            persona.setName(personaInputDto.getName());
        }
        if(personaInputDto.persona().getSurname() != null){
            persona.setSurname(personaInputDto.getSurname());
        }
        if(personaInputDto.persona().getCompany_email() != null){
            persona.setCompany_email(personaInputDto.getCompany_email());
        }
        if(personaInputDto.persona().getPersonal_email() != null){
            persona.setPersonal_email(personaInputDto.getPersonal_email());
        }
        if(personaInputDto.persona().getCity() != null){
            persona.setCity(personaInputDto.getCity());
        }
        if(personaInputDto.persona().getActive() != null){
            persona.setActive(personaInputDto.getActive());
        }
        if(personaInputDto.persona().getCreated_date() != null){
            persona.setCreated_date(personaInputDto.getCreated_date());
        }
        if(personaInputDto.persona().getImagen_url() != null){
            persona.setImagen_url(personaInputDto.getImagen_url());
        }
        if(personaInputDto.persona().getTermination_date() != null){
            persona.setTermination_date(personaInputDto.getTermination_date());
        }

        PersonaOutputDto personaOutputDto = new PersonaServiceImp().converToDto(persona);

        personaRepository.save(persona);

        return personaOutputDto;
    }

    public PersonaOutputDto buscarPorId (int id) throws Exception {
        PersonaOutputDto personaOutputDto = new PersonaServiceImp().converToDto(personaRepository.findById(id));

        if (personaOutputDto != null){
            return personaOutputDto;
        }else {
            throw new Exception("No existe ningun usuario con ese ID");
        }
    }

    public List<PersonaOutputDto> buscarUsuario(String usuario) {
        return personaRepository.findByUsuario(usuario)
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

}

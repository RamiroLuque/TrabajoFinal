/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.RRLG.Service;

import com.portfolio.RRLG.Entity.Persona;
import com.portfolio.RRLG.Interface.IPersonaService;
import com.portfolio.RRLG.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Ramiro
 */
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona =ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long Id) {
       ipersonaRepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(Long Id) {
    Persona persona  = ipersonaRepository.findById(Id).orElse(null);
    return persona;
    }
    
}

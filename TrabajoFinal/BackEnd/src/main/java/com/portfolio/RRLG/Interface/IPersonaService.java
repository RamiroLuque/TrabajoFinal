/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.RRLG.Interface;

import com.portfolio.RRLG.Entity.Persona;
import java.util.List;

/**
 *
 * @author Ramiro
 */
public interface IPersonaService {
   public List<Persona> getPersona();
   
   public void savePersona(Persona persona);
   
   public void deletePersona(Long Id);
   
   public Persona findPersona(Long Id);
}

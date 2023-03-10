
package com.portfolio.paula.Interface;

import com.portfolio.paula.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar el objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto(usuario) pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
}

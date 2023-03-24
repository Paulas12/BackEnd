
package com.portfolio.paula.Service;

import com.portfolio.paula.Entity.Persona;
import com.portfolio.paula.Repository.IPersonaRepository;
import com.portfolio.paula.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ImpPersonaService implements IPersonaService{
    //Traigo repo
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    
    
    @Override
    public List<Persona> getPersona() {
            List<Persona> persona = ipersonaRepository.findAll();
            return persona;
    }
//Guardar persona
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }
//Eliminar persona
    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);

    }
//Buscar persona
    @Override
    public Persona findPersona(Long id){
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;

    }
    
}

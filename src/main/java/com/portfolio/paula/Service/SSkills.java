
package com.portfolio.paula.Service;

import com.portfolio.paula.Entity.Skills;
import com.portfolio.paula.Repository.Rskills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {
     
    @Autowired
    Rskills rSkills;
    

    //Mostrar
    public List<Skills> list(){
        return rSkills.findAll();
    }

    //Buscar por id
    public Optional<Skills> getOne(int id){
        return rSkills.findById(id);
    }
    
    //Buscar nombreEd
    public Optional<Skills> getByNombreS(String nombreS){
        return rSkills.findByNombreS(nombreS);
    }
    
    //Guardar 
    public void save(Skills skill){
        rSkills.save(skill);
    }
    
    //Eliminar ID
    public void delete(int id){
        rSkills.deleteById(id);
    }
    
    //Existe id
    public boolean existsById(int id){
        return rSkills.existsById(id);
    }

    //Existe nombre
    public boolean existsByNombreS(String nombreS){
        return rSkills.existsByNombreS(nombreS);
    }
}


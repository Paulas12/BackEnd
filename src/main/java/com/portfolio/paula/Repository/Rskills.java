
package com.portfolio.paula.Repository;

import com.portfolio.paula.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rskills extends JpaRepository <Skills, Integer>{
    Optional<Skills> findByNombreSkill(String nombreSkill);
    boolean existsByNombreSkill(String nombreSkill); 
}

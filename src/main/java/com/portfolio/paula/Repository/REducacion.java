package com.portfolio.paula.Repository;

import com.portfolio.paula.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
    Optional<Educacion> findByTituloEd(String tituloEd);
    public boolean existsByTituloEd(String tituloEd);
}
package com.clinicaseprice.seprice.repositorio;

import com.clinicaseprice.seprice.Entidad.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elavincho
 */

@Repository
public interface TurnoRepositorio extends JpaRepository<Turno, Integer> {
    
}

package com.clinicaseprice.seprice.repositorio;

import com.clinicaseprice.seprice.Entidad.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elavincho
 */

@Repository
public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Integer> {
    
}

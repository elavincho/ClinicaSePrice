package com.clinicaseprice.seprice.repositorio;

import com.clinicaseprice.seprice.Entidad.Medico;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elavincho
 */
@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Integer> {
    
    Optional<Medico> findByEmail(String email);
    
}

package com.clinicaseprice.seprice.repositorio;

import com.clinicaseprice.seprice.Entidad.Paciente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elavincho
 */

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente, Integer> {
    
    Optional<Paciente> findByEmail(String email);
    
}

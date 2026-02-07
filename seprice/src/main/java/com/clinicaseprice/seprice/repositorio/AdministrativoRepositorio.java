package com.clinicaseprice.seprice.repositorio;

import com.clinicaseprice.seprice.Entidad.Administrativo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elavincho
 */
@Repository
public interface AdministrativoRepositorio extends JpaRepository<Administrativo, Integer> {
    
    Optional<Administrativo> findByEmail(String email);
    
}

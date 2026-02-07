package com.clinicaseprice.seprice.servicio;

import com.clinicaseprice.seprice.Entidad.Administrativo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elavincho
 */

public interface AdministrativoServicio {
    
    Optional<Administrativo> findById(Integer idAdministrativo);
    
    Administrativo save(Administrativo administrativo);
    
    Optional<Administrativo> findByEmail(String email);
    
    List<Administrativo> findAll();
    
    public void delete(Integer idAdministrativo);
    
    public Optional<Administrativo> get(Integer idAdministrativo);
    
}

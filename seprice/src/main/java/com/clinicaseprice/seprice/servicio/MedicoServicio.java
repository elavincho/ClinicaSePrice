package com.clinicaseprice.seprice.servicio;

import com.clinicaseprice.seprice.Entidad.Medico;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elavincho
 */

public interface MedicoServicio {
    
    Optional<Medico> findById(Integer idMedico);
    
    Medico save(Medico medico);
    
    Optional<Medico> findByEmail(String email);
    
    List<Medico> findAll();
    
    public void delete(Integer idMedico);
    
    public Optional<Medico> get(Integer idMedico);
    
}

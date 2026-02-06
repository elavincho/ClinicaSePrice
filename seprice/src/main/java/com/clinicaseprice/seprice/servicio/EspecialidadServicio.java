package com.clinicaseprice.seprice.servicio;

import com.clinicaseprice.seprice.Entidad.Especialidad;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elavincho
 */
public interface EspecialidadServicio {
    
    public Especialidad save(Especialidad especialidad);
    
    public void update(Especialidad especialidad);
    
    public void delete(Integer idEspecialidad);
    
    public List<Especialidad> findAll();
    
    public Optional<Especialidad> get(Integer idEspecialidad);
    
}

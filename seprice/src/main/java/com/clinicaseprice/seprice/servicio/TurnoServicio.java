package com.clinicaseprice.seprice.servicio;

import com.clinicaseprice.seprice.Entidad.Turno;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elavincho
 */
public interface TurnoServicio {
    
    public Turno save(Turno turno);
    
    public void update(Turno turno);
    
    public void delete(Integer idTurno);
    
    public List<Turno> findAll();
    
    public Optional<Turno> get(Integer idTurno);
    
}

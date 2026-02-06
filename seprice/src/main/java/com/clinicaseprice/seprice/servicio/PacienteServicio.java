package com.clinicaseprice.seprice.servicio;

import com.clinicaseprice.seprice.Entidad.Paciente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elavincho
 */
public interface PacienteServicio {
    
    Optional<Paciente> findById(Integer idPaciente);
    
    Paciente save(Paciente paciente);
    
    Optional<Paciente> findByEmail(String email);
    
    List<Paciente> findAll();
    
    public void delete(Integer idPaciente);
    
    public Optional<Paciente> get(Integer idPaciente);
    
}

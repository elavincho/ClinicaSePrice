package com.clinicaseprice.seprice.servicioImpl;

import com.clinicaseprice.seprice.Entidad.Paciente;
import com.clinicaseprice.seprice.repositorio.PacienteRepositorio;
import com.clinicaseprice.seprice.servicio.PacienteServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elavincho
 */

@Service
public class PacienteServicioImpl implements PacienteServicio {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    @Override
    public Optional<Paciente> findById(Integer idPaciente) {
        return pacienteRepositorio.findById(idPaciente);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteRepositorio.save(paciente);
    }

    @Override
    public Optional<Paciente> findByEmail(String email) {
        return pacienteRepositorio.findByEmail(email);
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteRepositorio.findAll();
    }

    @Override
    public void delete(Integer idPaciente) {
        pacienteRepositorio.deleteById(idPaciente);
    }

    @Override
    public Optional<Paciente> get(Integer idPaciente) {
        return pacienteRepositorio.findById(idPaciente);
    }
    
}

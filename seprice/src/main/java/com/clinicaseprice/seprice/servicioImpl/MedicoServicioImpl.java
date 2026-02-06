package com.clinicaseprice.seprice.servicioImpl;

import com.clinicaseprice.seprice.Entidad.Medico;
import com.clinicaseprice.seprice.repositorio.MedicoRepositorio;
import com.clinicaseprice.seprice.servicio.MedicoServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elavincho
 */
@Service
public class MedicoServicioImpl implements MedicoServicio {

    @Autowired
    private MedicoRepositorio medicoRepositorio;
    
    @Override
    public Optional<Medico> findById(Integer idMedico) {
        return medicoRepositorio.findById(idMedico);
    }

    @Override
    public Medico save(Medico medico) {
        return medicoRepositorio.save(medico);
    }

    @Override
    public Optional<Medico> findByEmail(String email) {
        return medicoRepositorio.findByEmail(email);
    }

    @Override
    public List<Medico> findAll() {
        return medicoRepositorio.findAll();
    }

    @Override
    public void delete(Integer idMedico) {
        medicoRepositorio.deleteById(idMedico);
    }

    @Override
    public Optional<Medico> get(Integer idMedico) {
        return medicoRepositorio.findById(idMedico);
    }
    
}

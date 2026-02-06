package com.clinicaseprice.seprice.servicioImpl;

import com.clinicaseprice.seprice.Entidad.Especialidad;
import com.clinicaseprice.seprice.repositorio.EspecialidadRepositorio;
import com.clinicaseprice.seprice.servicio.EspecialidadServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elavincho
 */

@Service
public class EspecialidadServicioImpl implements EspecialidadServicio {

    @Autowired
    private EspecialidadRepositorio especialidadRepositorio;
    
    @Override
    public Especialidad save(Especialidad especialidad) {
        return especialidadRepositorio.save(especialidad);
    }

    @Override
    public void update(Especialidad especialidad) {
        especialidadRepositorio.save(especialidad);
    }

    @Override
    public void delete(Integer idEspecialidad) {
        especialidadRepositorio.deleteById(idEspecialidad);
    }

    @Override
    public List<Especialidad> findAll() {
        return especialidadRepositorio.findAll();
    }

    @Override
    public Optional<Especialidad> get(Integer idEspecialidad) {
        return especialidadRepositorio.findById(idEspecialidad);
    }
    
}

package com.clinicaseprice.seprice.servicioImpl;

import com.clinicaseprice.seprice.Entidad.Turno;
import com.clinicaseprice.seprice.repositorio.TurnoRepositorio;
import com.clinicaseprice.seprice.servicio.TurnoServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elavincho
 */

@Service
public class TurnoServicioImpl implements TurnoServicio {
    
    @Autowired
    private TurnoRepositorio turnoRepositorio;

    @Override
    public Turno save(Turno turno) {
        return turnoRepositorio.save(turno);
    }

    @Override
    public void update(Turno turno) {
        turnoRepositorio.save(turno);
    }

    @Override
    public void delete(Integer idTurno) {
        turnoRepositorio.deleteById(idTurno);
    }

    @Override
    public List<Turno> findAll() {
        return turnoRepositorio.findAll();
    }

    @Override
    public Optional<Turno> get(Integer idTurno) {
        return turnoRepositorio.findById(idTurno);
    }
    
}

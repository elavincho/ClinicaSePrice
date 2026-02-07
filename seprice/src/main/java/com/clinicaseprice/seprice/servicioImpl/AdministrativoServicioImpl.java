package com.clinicaseprice.seprice.servicioImpl;

import com.clinicaseprice.seprice.Entidad.Administrativo;
import com.clinicaseprice.seprice.repositorio.AdministrativoRepositorio;
import com.clinicaseprice.seprice.servicio.AdministrativoServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elavincho
 */

@Service
public class AdministrativoServicioImpl implements AdministrativoServicio {
    
    @Autowired
    private AdministrativoRepositorio administrativoRepositorio;

    @Override
    public Optional<Administrativo> findById(Integer idAdministrativo) {
        return administrativoRepositorio.findById(idAdministrativo);
    }

    @Override
    public Administrativo save(Administrativo administrativo) {
        return administrativoRepositorio.save(administrativo);
    }

    @Override
    public Optional<Administrativo> findByEmail(String email) {
        return administrativoRepositorio.findByEmail(email);
    }

    @Override
    public List<Administrativo> findAll() {
        return administrativoRepositorio.findAll();
    }

    @Override
    public void delete(Integer idAdministrativo) {
        administrativoRepositorio.deleteById(idAdministrativo);
    }

    @Override
    public Optional<Administrativo> get(Integer idAdministrativo) {
        return administrativoRepositorio.findById(idAdministrativo);
    }
    
}

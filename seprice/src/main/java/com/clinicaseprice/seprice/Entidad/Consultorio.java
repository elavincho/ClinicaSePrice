package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author elavincho
 */
@Entity
@Table(name = "consultorios")
public class Consultorio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsultorio;
    private int nroConsultorio;
    private boolean estadoConsultorio;
    
    @OneToMany
    private List<Medico> medico;

    public Consultorio() {
    }

    public Consultorio(Integer idConsultorio, int nroConsultorio, boolean estadoConsultorio, List<Medico> medico) {
        this.idConsultorio = idConsultorio;
        this.nroConsultorio = nroConsultorio;
        this.estadoConsultorio = estadoConsultorio;
        this.medico = medico;
    }

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public int getNroConsultorio() {
        return nroConsultorio;
    }

    public void setNroConsultorio(int nroConsultorio) {
        this.nroConsultorio = nroConsultorio;
    }

    public boolean isEstadoConsultorio() {
        return estadoConsultorio;
    }

    public void setEstadoConsultorio(boolean estadoConsultorio) {
        this.estadoConsultorio = estadoConsultorio;
    }

    public List<Medico> getMedico() {
        return medico;
    }

    public void setMedico(List<Medico> medico) {
        this.medico = medico;
    }

}

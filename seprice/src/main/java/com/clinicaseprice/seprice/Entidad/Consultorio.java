package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;

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
    
    // Establecer relaciones entre clases
    private Medico nroMedico;

    public Consultorio() {
    }

    public Consultorio(Integer idConsultorio, int nroConsultorio, boolean estadoConsultorio, Medico nroMedico) {
        this.idConsultorio = idConsultorio;
        this.nroConsultorio = nroConsultorio;
        this.estadoConsultorio = estadoConsultorio;
        this.nroMedico = nroMedico;
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

    public Medico getNroMedico() {
        return nroMedico;
    }

    public void setNroMedico(Medico nroMedico) {
        this.nroMedico = nroMedico;
    }

}

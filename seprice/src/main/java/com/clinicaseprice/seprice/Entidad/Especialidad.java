package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;

/**
 *
 * @author elavincho
 */

@Entity
@Table(name = "especialidades")
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecialidad;
    private int nroEspecialidad;
    private String nombreEspecialidad;
    private String estadoEspecialidad;
    
    @ManyToOne
    private Medico medico;

    public Especialidad() {
    }

    public Especialidad(Integer idEspecialidad, int nroEspecialidad, String nombreEspecialidad, String estadoEspecialidad, Medico medico) {
        this.idEspecialidad = idEspecialidad;
        this.nroEspecialidad = nroEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.estadoEspecialidad = estadoEspecialidad;
        this.medico = medico;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getNroEspecialidad() {
        return nroEspecialidad;
    }

    public void setNroEspecialidad(int nroEspecialidad) {
        this.nroEspecialidad = nroEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getEstadoEspecialidad() {
        return estadoEspecialidad;
    }

    public void setEstadoEspecialidad(String estadoEspecialidad) {
        this.estadoEspecialidad = estadoEspecialidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}

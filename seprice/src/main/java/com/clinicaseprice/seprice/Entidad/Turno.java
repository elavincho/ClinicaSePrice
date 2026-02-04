package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author elavincho
 */

@Entity
@Table(name = "turnos")
public class Turno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurno;
    private int nroTurno;
    private Date fechaTurno;
    private String horaTurno;
    private String estadoTurno;
    
    // Establecer relaciones entre clases
    private Especialidad nroEspecialidad;
    private Medico nroMedico;
    private Paciente nroPaciente;

    public Turno() {
    }

    public Turno(Integer idTurno, int nroTurno, Date fechaTurno, String horaTurno, String estadoTurno, Especialidad nroEspecialidad, Medico nroMedico, Paciente nroPaciente) {
        this.idTurno = idTurno;
        this.nroTurno = nroTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.estadoTurno = estadoTurno;
        this.nroEspecialidad = nroEspecialidad;
        this.nroMedico = nroMedico;
        this.nroPaciente = nroPaciente;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(String estadoTurno) {
        this.estadoTurno = estadoTurno;
    }

    public Especialidad getNroEspecialidad() {
        return nroEspecialidad;
    }

    public void setNroEspecialidad(Especialidad nroEspecialidad) {
        this.nroEspecialidad = nroEspecialidad;
    }

    public Medico getNroMedico() {
        return nroMedico;
    }

    public void setNroMedico(Medico nroMedico) {
        this.nroMedico = nroMedico;
    }

    public Paciente getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(Paciente nroPaciente) {
        this.nroPaciente = nroPaciente;
    }
    
}

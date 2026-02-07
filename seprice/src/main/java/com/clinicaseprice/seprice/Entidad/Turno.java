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
    
    @ManyToOne
    private Especialidad especialidad;
    
    @ManyToOne
    private Medico medico;
    
    @ManyToOne
    private Paciente paciente;

    public Turno() {
    }

    public Turno(Integer idTurno, int nroTurno, Date fechaTurno, String horaTurno, String estadoTurno, Especialidad especialidad, Medico medico, Paciente paciente) {
        this.idTurno = idTurno;
        this.nroTurno = nroTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.estadoTurno = estadoTurno;
        this.especialidad = especialidad;
        this.medico = medico;
        this.paciente = paciente;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}

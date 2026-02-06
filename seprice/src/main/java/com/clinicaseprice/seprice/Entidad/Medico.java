package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author elavincho
 */
@Entity
@Table(name = "medicos")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;
    private int nroMedico;
    private String agenda;
    private String horario;
    private String nombreMedico;
    private String apellidoMedico;
    private String calle;
    private String nroCasa;
    private String localidad;
    private String provincia;
    private String pais;
    private String telefono;
    private String celular;
    private String email;
    private String estadoMedico;
    
    // Establecer relaciones entre clases
    private List<Consultorio> consultorios;
    private List<Especialidad> especialidades;
    
    public Medico() {
    }

    public Medico(Integer idMedico, int nroMedico, String agenda, String horario, String nombreMedico, String apellidoMedico, String calle, String nroCasa, String localidad, String provincia, String pais, String telefono, String celular, String email, String estadoMedico, List<Consultorio> consultorios, List<Especialidad> especialidades) {
        this.idMedico = idMedico;
        this.nroMedico = nroMedico;
        this.agenda = agenda;
        this.horario = horario;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.calle = calle;
        this.nroCasa = nroCasa;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.estadoMedico = estadoMedico;
        this.consultorios = consultorios;
        this.especialidades = especialidades;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public int getNroMedico() {
        return nroMedico;
    }

    public void setNroMedico(int nroMedico) {
        this.nroMedico = nroMedico;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNroCasa() {
        return nroCasa;
    }

    public void setNroCasa(String nroCasa) {
        this.nroCasa = nroCasa;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoMedico() {
        return estadoMedico;
    }

    public void setEstadoMedico(String estadoMedico) {
        this.estadoMedico = estadoMedico;
    }

    public List<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(List<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

}

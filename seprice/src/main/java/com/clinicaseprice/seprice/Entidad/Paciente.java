package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author elavincho
 */

@Entity
@Table(name = "pacientes")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;
    private int nroPaciente;
    private String nombrePaciente;
    private String apellidoPaciente;
    private Date fechaNacimiento;
    private String calle;
    private String nroCasa;
    private String localidad;
    private String provincia;
    private String pais;
    private String telefono;
    private String celular;
    private String email;
    private String estadoPaciente;
    private String tipoCobertura;
    private String modalidadPago;
    
    //Establecer relaciones entre clases
    private Turno nroTurno;

    public Paciente() {
    }

    public Paciente(Integer idPaciente, int nroPaciente, String nombrePaciente, String apellidoPaciente, Date fechaNacimiento, String calle, String nroCasa, String localidad, String provincia, String pais, String telefono, String celular, String email, String estadoPaciente, String tipoCobertura, String modalidadPago, Turno nroTurno) {
        this.idPaciente = idPaciente;
        this.nroPaciente = nroPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.fechaNacimiento = fechaNacimiento;
        this.calle = calle;
        this.nroCasa = nroCasa;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.estadoPaciente = estadoPaciente;
        this.tipoCobertura = tipoCobertura;
        this.modalidadPago = modalidadPago;
        this.nroTurno = nroTurno;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(int nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public String getModalidadPago() {
        return modalidadPago;
    }

    public void setModalidadPago(String modalidadPago) {
        this.modalidadPago = modalidadPago;
    }

    public Turno getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(Turno nroTurno) {
        this.nroTurno = nroTurno;
    }

    
}

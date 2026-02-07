package com.clinicaseprice.seprice.Entidad;

import jakarta.persistence.*;

/**
 *
 * @author elavincho
 */

@Entity
@Table(name = "administrativos")
public class Administrativo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdministrativo;
    private int nroAdministrativo;
    private String horario;
    private String nombreAdministrativo;
    private String apellidoAdministrativo;
    private String calle;
    private String nroCasa;
    private String localidad;
    private String provincia;
    private String pais;
    private String telefono;
    private String celular;
    private String email;
    private String estadoAdministrativo;

    public Administrativo() {
    }

    public Administrativo(Integer idAdministrativo, int nroAdministrativo, String horario, String nombreAdministrativo, String apellidoAdministrativo, String calle, String nroCasa, String localidad, String provincia, String pais, String telefono, String celular, String email, String estadoAdministrativo) {
        this.idAdministrativo = idAdministrativo;
        this.nroAdministrativo = nroAdministrativo;
        this.horario = horario;
        this.nombreAdministrativo = nombreAdministrativo;
        this.apellidoAdministrativo = apellidoAdministrativo;
        this.calle = calle;
        this.nroCasa = nroCasa;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.estadoAdministrativo = estadoAdministrativo;
    }

    public Integer getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public int getNroAdministrativo() {
        return nroAdministrativo;
    }

    public void setNroAdministrativo(int nroAdministrativo) {
        this.nroAdministrativo = nroAdministrativo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombreAdministrativo() {
        return nombreAdministrativo;
    }

    public void setNombreAdministrativo(String nombreAdministrativo) {
        this.nombreAdministrativo = nombreAdministrativo;
    }

    public String getApellidoAdministrativo() {
        return apellidoAdministrativo;
    }

    public void setApellidoAdministrativo(String apellidoAdministrativo) {
        this.apellidoAdministrativo = apellidoAdministrativo;
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

    public String getEstadoAdministrativo() {
        return estadoAdministrativo;
    }

    public void setEstadoAdministrativo(String estadoAdministrativo) {
        this.estadoAdministrativo = estadoAdministrativo;
    }
    
}

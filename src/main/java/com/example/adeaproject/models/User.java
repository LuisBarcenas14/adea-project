package com.example.adeaproject.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="usuario")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="password")
    private String password;

    @Column(name="nombre")
    private String nombre;

    @Column(name="cliente")
    private float cliente;

    @Column(name="email")
    private String email;

    @Column(name="fecha_alta")
    @CreationTimestamp
    private Date fechaAlta;

    @Column(name="fecha_baja")
    @CreationTimestamp
    private Date fechaBaja;

    @Column(name="status")
    private char status;

    @Column(name="intentos")
    private float intentos;

    @Column(name="fecha_revocado")
    @UpdateTimestamp
    private Date fechaRevocado;

    @Column(name="fecha_vigencia")
    @UpdateTimestamp
    private Date fechaVigencia;

    @Column(name="no_acceso")
    private int noAcceso;

    @Column(name="apeliido_paterno")
    private String apeliidoPaterno;

    @Column(name="apeliido_materno")
    private String apeliidoMaterno;

    @Column(name="area")
    private int area;

    @Column(name="fecha_modificacion")
    @UpdateTimestamp
    private Date fechaModificacion;

    public User() {}

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date createdAt) {
        this.fechaAlta = createdAt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCliente() {
        return cliente;
    }

    public void setCliente(float cliente) {
        this.cliente = cliente;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getIntentos() {
        return intentos;
    }

    public void setIntentos(float intentos) {
        this.intentos = intentos;
    }

    public Date getFechaRevocado() {
        return fechaRevocado;
    }

    public void setFechaRevocado(Date fechaRevocado) {
        this.fechaRevocado = fechaRevocado;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public int getNoAcceso() {
        return noAcceso;
    }

    public void setNoAcceso(int noAcceso) {
        this.noAcceso = noAcceso;
    }

    public String getApeliidoPaterno() {
        return apeliidoPaterno;
    }

    public void setApeliidoPaterno(String apeliidoPaterno) {
        this.apeliidoPaterno = apeliidoPaterno;
    }

    public String getApeliidoMaterno() {
        return apeliidoMaterno;
    }

    public void setApeliidoMaterno(String apeliidoMaterno) {
        this.apeliidoMaterno = apeliidoMaterno;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", email=" + email + ", password=" + password + ", fechaAlta=" + fechaAlta
                + ", fechaModificacion=" + fechaModificacion + "]";
    }


}

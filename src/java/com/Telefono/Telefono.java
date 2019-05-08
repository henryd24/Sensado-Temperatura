/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Telefono;

/**
 *
 * @author Henry Daniel
 */

/**
 * 
 * Esta clase se identifica 
 */
public class Telefono {

    private String nombre;
    private String propietario;
    private String id;

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpropietario() {
        return propietario;
    }

    public void setpropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Telefono{" + "nombre=" + nombre + ", propietario=" + propietario + ", id=" + id + '}';
    }

}

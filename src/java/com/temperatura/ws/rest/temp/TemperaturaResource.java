/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatura.ws.rest.temp;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Henry Daniel
 */

/**
 * 
 * Esta clase se encarga de exponer un servicio para que el dispositivo movil pueda obtener la temperatura al consumir este servicio
 */
@Path("temperature")
public class TemperaturaResource {

    double temp;
    String Valor;

    @Path("actualtemperature")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        temp = Math.random() * 6;
        Valor = "" + temp;
        return Valor;
    }
}

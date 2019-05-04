/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatura.ws.rest.registro;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Henry Daniel
 */
@Path("temperatura")
public class TemperaturaResource {

    @Path("actualtemperature")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        double name = Math.random()*6;
        String Valor=""+name;
        return Valor;
    }

    @Path("register")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String ID) {
        System.out.println(ID);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatura.ws.rest.registro;

import com.Telefono.Telefono;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Henry Daniel
 */
@Path("register")
public class RegistroResource {
    @Path("newregister")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Telefono movil) {
        System.out.println(movil);
    }
}

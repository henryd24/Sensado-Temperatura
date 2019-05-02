package com.temperatura.ws.rest.temp;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/temperatura")
public class Temperatura {
	
	private int Temperatura;
	
	@POST
	@Path("/temperatura")
	@Produces({MediaType.APPLICATION_JSON})
	public int getTemperatura() {
		//Aqui iria el codigo para obtener la temperatura del arduino para luego entregarla en el return para mostrar en el dispositivo
		return Temperatura;
	}

}
package com.temperatura.ws.rest.registro;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
@Path("/registro")
public class Registro {
	private String Registro;
	
	@POST
	@Path("/registrar")
	@Consumes({MediaType.APPLICATION_JSON})
	public void setRegistro(String registro) {
		//Aqui va el codigo para registrar dispositivo en AWS
		Registro = registro;
	}


	
}

package EletronicosApp.controller;

import EletronicosApp.model.domain.Cliente;
import spark.Request;
import spark.Response;
import spark.Route;

public class ClienteController implements Route {

	@Override
	public Cliente handle(Request request, Response response) throws Exception {
		
		return new Cliente(0, null, null);
	}
	
}
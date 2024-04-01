package EletronicosApp;

import EletronicosApp.controller.ClienteController;
import spark.Spark;


public class App {
	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req,res) -> {return App.class.getResourceAsStream("/index.html");});
		
		Spark.get("/cliente", new ClienteController());
		
		System.out.println("teste");
				
	}

	
}
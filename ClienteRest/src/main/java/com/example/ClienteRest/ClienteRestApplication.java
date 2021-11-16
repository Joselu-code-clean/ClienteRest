package com.example.ClienteRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ClienteRest.model.Coche;
import com.example.ClienteRest.service.RotorService;

@SpringBootApplication
public class ClienteRestApplication implements CommandLineRunner{
	
	
	private  RotorService rotorService = new RotorService();

	public static void main(String[] args) {
		SpringApplication.run(ClienteRestApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*Creamos el circuitBreaker con un for, que cada 5sec comprueba el estado en el servidor
		 * y cambio su estado al siguiente*/
		String state = "close";
		Coche coche = new Coche(state, "Citroen", 4);
		
		try {
			for (int i = 0; i < 5 && coche.getStatus().equals("open"); i++) {
				coche.setStatus("half-open");
				rotorService.setToHalfOpen();
				Thread.sleep(2000);
				if (coche.getStatus().equals("open")) {
					rotorService.setToClose();
				}else if (coche.getStatus().equals("half-open")) {
					rotorService.setToClose();
				}			
				
				
				
			}
		}catch (Exception e) {
            // catching the exception
            System.out.println("Error en la ejecución en el hilo");
        }
		
	}

}

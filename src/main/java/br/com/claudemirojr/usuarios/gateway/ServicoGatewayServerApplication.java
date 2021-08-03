package br.com.claudemirojr.usuarios.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicoGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoGatewayServerApplication.class, args);
	}

}

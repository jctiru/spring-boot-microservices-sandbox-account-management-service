package io.jctiru.springbootmicroservicessandboxaccountmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMicroservicesSandboxAccountManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesSandboxAccountManagementServiceApplication.class, args);
	}

}

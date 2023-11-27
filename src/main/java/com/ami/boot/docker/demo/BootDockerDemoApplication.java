package com.ami.boot.docker.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootDockerDemoApplication {
@Autowired
EmployeeRepository repository;

	@GetMapping("message")
	public String getMessage() {
		return "Hello welcome to Docker with Azure Cloud";
		
		//"jdbc:sqlserver://springboot-demo-server.database.windows.net:1433;database=springboot-demo-db;user=ameen@springboot-demo-server;password=Password@123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;"
	}
	
	@PostMapping("employee")
	public void addEmployee(Employee employee) {
		repository.save(employee);
	}
	
	@GetMapping("employees")
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(BootDockerDemoApplication.class, args);
	}

}

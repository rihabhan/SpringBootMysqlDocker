package com.sbmysql.sbmysql;

import com.sbmysql.sbmysql.model.Employee;
import com.sbmysql.sbmysql.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbmysqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbmysqlApplication.class, args);
	}

	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("islem");
		employeeRepo.save(employee);
	}
}

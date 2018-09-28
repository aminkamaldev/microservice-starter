package com.akamal.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.akamal.model.Employee;
import com.akamal.repository.EmployeeRepository;

@Component
@Profile("developement")
public class DataLoader implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("A177778", "Amin KAMAL", "password"));
		this.employeeRepository.save(new Employee("A157378", "Ziyad KAMAL", "password"));
		this.employeeRepository.save(new Employee("A171279", "Kenza KAMAL", "password"));
		this.employeeRepository.save(new Employee("A237745", "Seddik KAMAL", "password"));
	}
}

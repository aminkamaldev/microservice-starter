package com.akamal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.akamal.model.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Employee Entity")
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	@ApiOperation("find Employee by username")
	Employee findByUsername(@Param("username") @ApiParam(value = "username of the employee") String username);

}

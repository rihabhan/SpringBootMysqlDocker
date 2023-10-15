package com.sbmysql.sbmysql.repository;

import com.sbmysql.sbmysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //all crud database methods

}

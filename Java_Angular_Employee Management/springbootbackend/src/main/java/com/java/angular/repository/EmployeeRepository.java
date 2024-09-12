// jpa repositories exposes database CRUD method
// A full API CrudRepository and Paging And SortingRepository.
// Jpa Repository contains the APIs for basic CRUD operations, 
// the APIS for pagination, and the APIs for sorting
package com.java.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.angular.model.Employee;

// Here Long is the data type of primary key in Employee model
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

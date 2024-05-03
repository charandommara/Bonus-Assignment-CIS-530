package csu.bonusassignment.repositories;

import csu.bonusassignment.dbentities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByLastName(String lastName);

    @Query(value = "SELECT * FROM EMPLOYEE t WHERE t.LNAME LIKE :lastName", nativeQuery = true)
    List<Employee> searchEmployeeByLastName(String lastName);
}

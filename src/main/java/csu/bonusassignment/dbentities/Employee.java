package csu.bonusassignment.dbentities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "SSN")
    private String ssn;

    @Column(name = "FNAME")
    private String firstName;

    @Column(name = "MINIT")
    private String middleInitial;

    @Column(name = "LNAME")
    private String lastName;

    @Column(name = "BDATE")
    private Date birthDate;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SEX")
    private char sex;

    @Column(name = "SALARY")
    private float salary;

    @ManyToOne
    @JoinColumn(name = "SUPERSSN")
    private Employee supervisor;

    @ManyToOne
    @JoinColumn(name = "DNO")
    private Department department;
}

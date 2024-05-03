package csu.bonusassignment.dbentities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @Column(name = "DNUMBER")
    private int departmentNumber;

    @Column(name = "DNAME")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "MGRSSN")
    private Employee manager;

    @Column(name = "MGRSTARTDATE")
    private Date managerStartDate;
}

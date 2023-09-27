package chanh.com.wwwweek2.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", columnDefinition = "bigint(20)")
    private Long id;

    @Column(name = "address", columnDefinition = "varchar(250)")
    private String address;

    @Column(name = "dob")
    private LocalDateTime dob;
    @Column(name = "email", columnDefinition = "varchar(150)")
    private String email;
    @Column(name = "full_name", columnDefinition = "varchar(150)")
    private String fullName;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Enumerated(EnumType.ORDINAL)
    @Column(columnDefinition = "int")
    private EmployeeStatus status;


}

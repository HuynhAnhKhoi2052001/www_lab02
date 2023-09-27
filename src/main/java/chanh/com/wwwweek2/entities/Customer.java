package chanh.com.wwwweek2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cust_name", columnDefinition = "varchar(250)")
    private String name;
    @Column(name = "email", columnDefinition = "varchar(150)")
    private String email;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "address", columnDefinition = "varchar(150)")
    private String address;

}

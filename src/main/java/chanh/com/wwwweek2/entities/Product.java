package chanh.com.wwwweek2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product{
    @Id
    @Column(name = "product_id")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "varchar(150)")
    private String name;
    @Column(name = "description", columnDefinition = "varchar(250)")
    private String description;
    @Column(columnDefinition = "varchar(25)")
    private String unit;
    @Column(name = "manufacturer_name", columnDefinition = "varchar(100)")
    private String manufacturer;
    @Enumerated(EnumType.ORDINAL)
    @Column(columnDefinition="int")
    private ProductStatus status;

}

package chanh.com.wwwweek2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @Column(columnDefinition = "varchar(250)")
    private String path;
    @Column(columnDefinition = "varchar(250)")
    private String alternative;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
}

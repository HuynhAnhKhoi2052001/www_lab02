package chanh.com.wwwweek2.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @Column(name = "price_date_time")
    private LocalDateTime priceDateTime;
    private Double price;
    private String note;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}

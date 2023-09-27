package chanh.com.wwwweek2.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    private Double quantity;
    private Double price;
    private String note;
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}

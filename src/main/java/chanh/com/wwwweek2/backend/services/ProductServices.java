package chanh.com.wwwweek2.backend.services;


import chanh.com.wwwweek2.backend.enums.ProductStatus;
import chanh.com.wwwweek2.backend.models.Product;
import chanh.com.wwwweek2.backend.repositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private final ProductRepository repository;

    public ProductServices() {
        repository = new ProductRepository();
    }

    public void insert(Product product) {
        repository.insert(product);
    }

    public List<Product> getActiveProducts() {
        return repository.getActiveProduct();
    }

    public void updateStatus(long id, ProductStatus status) {
        repository.updateStatus(id, status);
    }
}

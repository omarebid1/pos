package com.omarebid.pos.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Table(name = "products")
@Data
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer ProductId;

    @Column(name = "product_name")
    private String ProductName;

    @Column(name = "product_price")
    private Double ProductPrice;

    @Column(name = "product_barcode")
    private String ProductBarcode;
}

package com.omarebid.pos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "sales")
@Data
@Entity
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer saleId;

    @Column(name = "prodcut_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderId;
}

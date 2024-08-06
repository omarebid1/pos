package com.omarebid.pos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "orders")
@Data
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oder_id")
    private Integer orderId;

    @Column(name = "total_cost")
    private Double totalCost;

}

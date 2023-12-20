package org.soulaimane.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}

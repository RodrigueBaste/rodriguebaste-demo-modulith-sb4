package org.formation.catalog.internal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CoffeeEntity {
    @Id
    private Long id;

    private String name;

    private int price;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}

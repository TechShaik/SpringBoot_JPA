package com.boot_files.LearnBoot;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "prd_data")
public class Product {

    String model;
    @Id
    int id;
    float price;

    // Default constructor
    public Product() {
    }

    // Optionally, you can keep this constructor for manual instantiation
    public Product(String model, int id, float price) {
        this.model = model;
        this.id = id;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

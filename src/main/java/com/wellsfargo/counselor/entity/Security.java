package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDateTime;

import jakarta.persistence.Column;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String name;
    @Column
    private String category;
    @Column
    private String purchasePrice;
    @Column
    private LocalDateTime purchaseDate;
    @Column
    private long quantity;
    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    protected Security() {
    }

    // Constructor with parameters
    public Security(String name, String category, String purchasePrice, LocalDateTime purchaseDate, long quantity,
            Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters and Setters

    public Long getId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

}

package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long security_id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private long portfolio_id;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchase_price;

    @Column(nullable = false)
    private date purchase_date;

    @Column(nullable = false)
    private double quantity;

    @Column(nullable = false)
    private String created_at;

    protected Securities() {

    }

    public Securities(String title, String body, long portfolio_id, String status, String name, String category, float purchase_price, date purchase_date, double quantity, String created_at) {
        this.title = title;
        this.body = body;
        this.portfolio_id = portfolio_id;
        this.status = status;
        this.name = name;
        this.category = category;
        this.purchase_price = purchase_price;
        this.purchase_date = purchase_date;
        this.quantity = quantity;
        this.created_at = created_at;
    }

    public long getSecurity_id() {
        return security_id;
    }

    public String getTitle() {
        return username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public float getPurchasePrice() {
        return purchase_price;
    }

    public void setPurchasePrice(float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getPurchaseDate() {
        return purchase_date;
    }

    public void setPurchaseDate(float purchase_date) {
        this.purchase_date = purchase_date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void getCreated_at() {
        return created_at;
    }
}
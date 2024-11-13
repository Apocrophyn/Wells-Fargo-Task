package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolio_id;

    @Column(nullable = false)
    private long client_id;

    @Column(nullable = false)
    private String created_at;

    protected Portfolio() {

    }

    public Portfolio(String client_id, String created_at) {
        this.client_id = client_id;
        this.created_at = created_at;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void getCreated_at() {
        return created_at;
    }
}
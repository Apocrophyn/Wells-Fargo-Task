package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private ClientR client;

    @OneToMany
    private List<Security> securities;

    public Portfolio(long portfolioId, LocalDateTime creationDate, ClientR client, List<Security> securities) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.client = client;
        this.securities = securities;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public ClientR getClient() {
        return client;
    }

    public void setClient(ClientR client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurites(List<Security> securities) {
        this.securities = securities;
    }

}

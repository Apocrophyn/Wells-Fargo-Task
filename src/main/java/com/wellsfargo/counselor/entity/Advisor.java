package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisors {

    @Id
    @GeneratedValue()
    private long advisor_id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String created_at;

    protected Advisors() {

    }

    public Advisors(String username, String created_at) {
        this.username = username;
        this.created_at = created_at;
    }

    public Long getAdvisor_id() {
        return advisor_id;
    }

    public String getUsername() {
        return username;
    }

    public void getCreated_at() {
        return created_at;
    }
}

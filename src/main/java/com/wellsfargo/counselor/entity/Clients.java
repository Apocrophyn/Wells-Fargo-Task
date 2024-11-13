package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Clients {

    @Id
    @GeneratedValue()
    private long client_id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private long advisor_id;

    @Column(nullable = false)
    private String created_at;

    protected Clients() {

    }

    public Clients(String username, String firstName, String lastName, String email, String phone, String type, String advisor_id, String created_at) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.type = type;
        this.advisor_id = advisor_id;
        this.created_at = created_at;
    }

    public long getClient_id() {
        return client_id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdvisor_id() {
        return advisor_id;
    }

    public String getCreated_at() {
        return created_at;
    }
}
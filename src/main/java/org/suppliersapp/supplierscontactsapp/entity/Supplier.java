package org.suppliersapp.supplierscontactsapp.entity;

// table - supplier

import javax.persistence.Entity;

@Entity
public class Supplier {
    private int Id;
    private String name;
    private String email;

    public Supplier(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Supplier(int id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }
}

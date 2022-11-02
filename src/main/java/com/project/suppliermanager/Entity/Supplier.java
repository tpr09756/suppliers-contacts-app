package com.project.suppliermanager.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "SUPPLIER_TBL")
public class Supplier {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "email", nullable = false, length = 100)
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {

        return "Supplier{" +
                "Name='" + name + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }


}




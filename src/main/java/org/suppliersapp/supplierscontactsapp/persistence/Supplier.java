package org.suppliersapp.supplierscontactsapp.persistence;

// table - supplier

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String email;

    protected Supplier(){};

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
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

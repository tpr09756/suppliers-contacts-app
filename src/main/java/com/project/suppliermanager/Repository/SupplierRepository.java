package com.project.suppliermanager.Repository;

import com.project.suppliermanager.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    Supplier findByName(String name);



}

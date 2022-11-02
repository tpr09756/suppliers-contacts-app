package com.project.suppliermanager.Repository;

import com.project.suppliermanager.Entity.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Integer> {

}

package com.project.SupplierManager;


import com.project.suppliermanager.Entity.Supplier;
import com.project.suppliermanager.Repository.SupplierRepository;
import com.project.suppliermanager.SupplierManagerApplication;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

@DataJpaTest
@ContextConfiguration(classes = SupplierManagerApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class SupplierRepositoryTest {
    @Autowired
    private SupplierRepository repo;

    @Test
    public void testSupplier(){
        Supplier supplier = new Supplier();
        //supplier.setId(1);
        supplier.setName("tiago");
        supplier.setEmail("tpr09756@gmail.com");
        supplier.setPhone("967948487");
        supplier.setSite("www.qualquercoisa.org");


        Supplier saveSupplier = repo.save(supplier);
        //System.out.println(supplier.getId());
        Assertions.assertThat(saveSupplier).isNotNull();
        Assertions.assertThat(saveSupplier.getId()).isGreaterThan(0);
    }

    @Test
    public void testListSupplier(){
        Iterable<Supplier> suppliers = repo.findAll();


        for (Supplier supplier:suppliers){
            System.out.println(suppliers);
        }
    }

    @Test
    public void testUpdate(){
        Integer supplierId = 1;
         Optional<Supplier> optionalSupplier = repo.findById(1);
         Supplier supplier = optionalSupplier.get();
         supplier.setName("Tiago Rodrigues");
         repo.save(supplier);

         Supplier updatedSupplier = repo.findById(supplierId).get();
         Assertions.assertThat(updatedSupplier.getName()).isEqualTo("Tiago Rodrigues");
    }
}

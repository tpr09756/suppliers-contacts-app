package com.project.suppliermanager.Service;

import com.project.suppliermanager.Entity.Supplier;
import com.project.suppliermanager.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class SupplierService {




    @Autowired
    private SupplierRepository repository;

    public Supplier saveSupplier(Supplier supplier) {
            return repository.save(supplier);
        }

        public List<Supplier> getSuppliers() {
            return (List<Supplier>) repository.findAll();
        }

        public Supplier getSupplierById(int id) throws SupplierNotFoundException {
            Optional<Supplier> result = repository.findById(id);
            if (result.isPresent()) {
                return result.get();
            }
            throw new SupplierNotFoundException("Could not found supplier with ID:" + id);
        }

        public String deleteSupplier(int id) {
            repository.deleteById(id);
            return "supplier removed !! " + id;
        }

        public Supplier updateSupplier(Supplier supplier) {
            Supplier existingSupplier = repository.findById(supplier.getId()).orElse(null);
            existingSupplier.setName(supplier.getName());
            existingSupplier.setEmail(supplier.getEmail());
            return repository.save(existingSupplier);
        }


}


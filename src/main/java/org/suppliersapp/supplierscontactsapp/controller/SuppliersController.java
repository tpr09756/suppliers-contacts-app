package org.suppliersapp.supplierscontactsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suppliersapp.supplierscontactsapp.entity.Supplier;

import java.util.Arrays;
import java.util.List;

@RestController
public class SuppliersController {

    @GetMapping("/supplier")
    public List<Supplier> getAllSuppliers(){
        return Arrays.asList(new Supplier(1, "Quimicos", "email"));
    }
}

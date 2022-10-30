package org.suppliersapp.supplierscontactsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuppliersController {

    @GetMapping("/supplier")
    public String getAllSuppliers(){
        //return Arrays.asList(new Supplier(1, "Quimicos", "email"));
        return "supplier";
    }
}

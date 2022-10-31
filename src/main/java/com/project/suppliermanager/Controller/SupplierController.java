package com.project.suppliermanager.Controller;

import com.project.suppliermanager.Entity.Supplier;
import com.project.suppliermanager.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller("/index")
public class SupplierController {

    @Autowired
    private SupplierService service;

    @PostMapping("/supplier/save")
    public String addSupplier(Supplier supplier, RedirectAttributes ra) {
        service.saveSupplier(supplier);
        ra.addFlashAttribute("Saved successfully");
        return "redirect:/suppliers";
    }

    @GetMapping("/supplier/new/")
    public String newSupplierForm(Model model){
        model.addAttribute("supplier", new Supplier());
        return "supplier_form";
    }

    @GetMapping("/suppliers")
    public String showAllSuppliers(Model model) {

        List<Supplier> listSupplier = service.getSuppliers();
        model.addAttribute("listSupplier", listSupplier);
        return "/suppliers";
    }

    @GetMapping("/suppliersById/{id}")
    public Supplier findSupplierById(@PathVariable int id) {
        return service.getSupplierById(id);
    }

    @GetMapping("/supplier/{name}")
    public Supplier findProductByName(@PathVariable String name) {
        return service.getSupplierByName(name);
    }

    @PutMapping("/update")
    public Supplier updateSupplier(@RequestBody Supplier supplier) {
        return service.updateSupplier(supplier);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
        return service.deleteSupplier(id);
    }
}
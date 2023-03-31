package edu.iu.c322.invoicingservice.controller;

import edu.iu.c322.invoicingservice.model.Invoice;
import edu.iu.c322.invoicingservice.model.UpdateStatus;
import edu.iu.c322.invoicingservice.repository.InvoiceRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private InvoiceRepository repository;

    public InvoiceController(InvoiceRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    public int create(@RequestBody Invoice invoice) {
        return repository.create(invoice);
    }
    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable int id) {
        return repository.getInvoiceByOrder(id);
    }
    @PutMapping("/{id}")
    public void updateStatus(@RequestBody UpdateStatus updateStatus, @PathVariable int id) {
        repository.update(updateStatus, id);

    }
}

package edu.iu.c322.invoicingservice.repository;

import edu.iu.c322.invoicingservice.model.Invoice;
import edu.iu.c322.invoicingservice.model.InvoiceItem;
import edu.iu.c322.invoicingservice.model.UpdateStatus;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepository {
    private List<Invoice> invoices = new ArrayList();
    public List<Invoice> findAll() {return invoices;}
    public int create(Invoice invoice) {
        invoices.add(invoice);
        return invoices.size();
    }
    public Invoice getInvoiceByOrder(int id) {
        if(id <= invoices.size()) {
            return invoices.get(id -1);
        }
        else {
            //return null;
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "order with this id does not exist in the system."
            );
        }

    }
    public void update(UpdateStatus updateStatus, int id) {
        Invoice invoice = invoices.get(id - 1);
        InvoiceItem it = invoice.getInvoiceItem();
        it.setStatus(updateStatus.getStatus());
        invoice.setInvoiceItem(it);
        invoices.set(id - 1, invoice);
    }

    private Invoice getInvoicebyId(int id) {

        return invoices.get(id);
    }
}

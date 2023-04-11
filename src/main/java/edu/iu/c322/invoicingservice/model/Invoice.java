
package edu.iu.c322.invoicingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

public class Invoice {
    private Date orderPlaced;

    private float total;

    private List<InvoiceItem> invoiceItems;

    private Payment payment;

}

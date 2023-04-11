package edu.iu.c322.invoicingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceItem {
    private String status;
    private Date on;

    private Address address;

    private List<Item> items;
}

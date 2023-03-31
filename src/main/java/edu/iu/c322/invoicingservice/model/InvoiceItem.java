package edu.iu.c322.invoicingservice.model;

import java.util.ArrayList;
import java.util.List;

public class InvoiceItem {
    private String status;
    private List<Item> items;
    private String on;
    private Address address;

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

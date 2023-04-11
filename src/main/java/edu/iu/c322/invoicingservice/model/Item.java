package edu.iu.c322.invoicingservice.model;

public record Item(int id,
                        String name,
                        int quantity,
                        float price) {
}

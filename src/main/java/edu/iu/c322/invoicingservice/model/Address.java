package edu.iu.c322.invoicingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public record Address(int id,
                      String state,
                      String city,
                      int postalCode) {
}
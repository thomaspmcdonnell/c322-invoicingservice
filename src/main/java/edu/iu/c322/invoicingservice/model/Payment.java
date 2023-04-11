package edu.iu.c322.invoicingservice.model;

public record Payment(int id,
                      String method,
                      String number,
                      Address billingAddress) {
}

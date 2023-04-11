package edu.iu.c322.invoicingservice.controller;

import edu.iu.c322.invoicingservice.model.Order;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private final WebClient orderService;


    public InvoiceController(WebClient.Builder webClientBuilder) {
        orderService = webClientBuilder.baseUrl("http://localhost:8083").build();
    }


    @GetMapping("/{orderId}")
    public Mono<Order> findByOrderId(@PathVariable int orderId){
        return orderService.get().uri("/orders/order/{orderId}", orderId)
                .retrieve()
                .bodyToMono(Order.class);
    }
}
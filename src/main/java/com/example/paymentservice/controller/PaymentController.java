package com.example.paymentservice.controller;

import com.example.paymentservice.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping
    public List<Payment> getAllPayments() {
        return Arrays.asList(
                new Payment(1L, "1", 1200.0),
                new Payment(2L, "2", 500.0)
        );
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return new Payment(id, "sample-order", 100.0);
    }
}
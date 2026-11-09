package com.rashad.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double ammount) {
        System.out.println("Paypal");
        System.out.println("Amount: " + ammount);
    }
}

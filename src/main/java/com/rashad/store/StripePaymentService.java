package com.rashad.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.url}")
    private String url;

    @Value("${stripe.enables}")
    private boolean enables;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currency}")
    private List<String> currency;


    @Override
    public void  processPayment(double ammount){
        System.out.println("API URL: " + url);
        System.out.println("Enabled: " + enables);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currency: " + currency);
        System.out.println("stripe");
        System.out.println("Amount: " + ammount);
    }
}

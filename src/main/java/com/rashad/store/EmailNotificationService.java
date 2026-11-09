package com.rashad.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${email.host}")
    private String host;

   @Value("${email.port}")
    private String port;

    @Override
    public void send(String message , String recipientEmail) {
        System.out.println("Recipient: "+ recipientEmail);
        System.out.println("Message: "+ message);
        System.out.println("Host: "+ host);
        System.out.println("Port: "+ port);
        System.out.println("Email sent successfully.");
    }
}

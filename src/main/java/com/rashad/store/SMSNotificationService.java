package com.rashad.store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message , String recipientEmail) {
        System.out.println("SMS is sent successfully.");
    }
}

package com.siddhartha.factory;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("This is an SMS Notification");
    }
}

package com.siddhartha.factory;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("This is an Email Notification");
    }
}

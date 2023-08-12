package com.siddhartha.factory;

public class PushNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("This is an Push Notification");
    }
}

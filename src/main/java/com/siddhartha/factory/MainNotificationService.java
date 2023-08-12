package com.siddhartha.factory;

public class MainNotificationService {
    /*
    * This is the Main Class that implements a Notification Service
    * It gets the specific notification instance based on the provided notification type
    * */
    public static void main(String[] args) {

        NotificationFactory notificationFactory= new NotificationFactory();
        Notification smsNotification = notificationFactory.createNotification(NotificationTypes.SMS);
        Notification emailNotification = notificationFactory.createNotification(NotificationTypes.EMAIL);
        Notification pushNotification = notificationFactory.createNotification(NotificationTypes.PUSH);

        smsNotification.sendNotification();
        emailNotification.sendNotification();
        pushNotification.sendNotification();
    }
}

package com.siddhartha.factory;

import java.util.Objects;

public class NotificationFactory {
    public Notification createNotification(NotificationTypes notificationType){
        if(Objects.isNull(notificationType))
            return null;
        switch (notificationType){
            case SMS: return new SMSNotification();
            case EMAIL: return new EmailNotification();
            case PUSH: return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown Notification Type: "+notificationType);
        }
    }
}

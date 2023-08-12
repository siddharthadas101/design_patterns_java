package com.siddhartha.factory;

/*
* This Enum serves the following purposes
* Clearly defining what kind of Notifications can be sent by the system
* Limiting the possibility of using an unknown notification type
* because the Notification Factory accepts only the values from this enum
* and not random string values.
* This eliminates the scope of using an unknown notification type
* */
public enum NotificationTypes {
    SMS,
    EMAIL,
    PUSH;
}

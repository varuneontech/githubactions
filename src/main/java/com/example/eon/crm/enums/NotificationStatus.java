package com.example.eon.crm.enums;

public enum NotificationStatus {
    PENDING,    // Notification is pending and not yet sent
    SENT,       // Notification has been sent
    DELIVERED,  // Notification has been delivered to the recipient
    READ,       // Notification has been read by the recipient
    FAILED      // Notification failed to be sent
}

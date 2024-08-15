package com.example.eon.crm.enums;

public enum EmailStatus {
    PENDING,      // Email is pending and has not yet been sent
    SENT,         // Email has been sent to the recipient
    DELIVERED,    // Email has been successfully delivered to the recipient's inbox
    OPENED,       // Email has been opened by the recipient
    CLICKED,      // A link in the email has been clicked by the recipient
    BOUNCED,      // Email could not be delivered, usually due to an invalid email address or mailbox issue
    FAILED,       // Email sending failed due to some error or issue
    UNDELIVERABLE // Email cannot be delivered, typically after multiple bounce attempts
}

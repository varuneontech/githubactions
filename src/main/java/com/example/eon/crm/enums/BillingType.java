package com.example.eon.crm.enums;

public enum BillingType {
    MONTHLY,          // Billing occurs on a monthly basis
    YEARLY,           // Billing occurs on a yearly basis
    SESSION_BASED,    // Billing based on the number of sessions attended
    PAY_AS_YOU_GO,    // Billing based on usage, such as pay per visit or class
    MEMBERSHIP_FEE,   // A standard membership fee for access to the gym
    PERSONAL_TRAINING, // Billing specifically for personal training sessions
    CLASS_PACKAGE,    // Billing for a package of classes, e.g., 10-class package
    CUSTOM_PLAN       // Custom billing plans defined individually for clients
}


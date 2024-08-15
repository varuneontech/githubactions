package com.example.eon.crm.entity;

import com.example.eon.crm.enums.NotificationChannel;
import com.example.eon.crm.enums.NotificationStatus;
import com.example.eon.crm.enums.NotificationType;
import com.example.eon.crm.enums.ReadReceipt;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "notification")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Notification {
    @Id
    @Column(name = "notifiicatiion_id")
    private String notificationId;
    @Enumerated(EnumType.STRING)
    @Column(name = "notifiicatiion_type")
    private NotificationType notificationType;  // Enum for notification types

    @Enumerated(EnumType.STRING)
    @Column(name = "notifiicatiion_channel")
    private NotificationChannel notificationChannel;  // Enum for notification channels

    @Temporal(TemporalType.DATE)
    @Column(name = "notifiicatiion_date")
    private Date notificationDate;

    @Column(name = "notifiicatiion_content")
    private String notificationContent;

    @Temporal(TemporalType.DATE)
    @Column(name = "notifiicatiion_time")
    private Date notificationTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "notifiicatiion_status")
    private NotificationStatus notificationStatus;  // Enum for notification status

    @Enumerated(EnumType.STRING)
    @Column(name = "read_recipt")
    private ReadReceipt readReceipt;  // Enum for read receipt status

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "version")
    private Long version;

}

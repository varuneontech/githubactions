package com.example.eon.crm.entity;

import com.example.eon.crm.enums.EmailModule;
import com.example.eon.crm.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "email")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Long emailId;

    @Column(name = "email_sent_to")
    private String emailSentTo;

    @Column(name = "email_subject")
    private String emailSubject;

    @Temporal(TemporalType.DATE)
    @Column(name = "email_sent_on")
    private Date emailSentOn;

    @Column(name = "email_sent_by")
    private String emailSentBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "email_module")
    private EmailModule emailModule;  // Enum for email modules

    @Temporal(TemporalType.DATE)
    @Column(name = "email_last_opened")
    private Date emailLastOpened;

    @Temporal(TemporalType.DATE)
    @Column(name = "email_last_clicked")
    private Date emailLastClicked;

    @Temporal(TemporalType.DATE)
    @Column(name = "email_bounced_time")
    private Date emailBouncedTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "email_status")
    private EmailStatus emailStatus;  // Enum for email status

    @Column(name = "email_thread_number")
    private Integer emailThreadNumber;

    @Column(name = "version")
    private Long version;
}

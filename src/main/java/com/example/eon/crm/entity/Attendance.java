package com.example.eon.crm.entity;

import com.example.eon.crm.enums.SessionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "attendance")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long attendanceId;
    @Temporal(TemporalType.DATE)
    @Column(name = "attendance_date")
    private Date attendanceDate;
    @Temporal(TemporalType.TIME)
    @Column(name = "checkin_time")
    private Date checkinTime;
    @Temporal(TemporalType.TIME)
    @Column(name = "checkout_time")
    private Date checkoutTime;
    @Column(name = "session_number")
    private Integer sessionNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "session_type")
    private SessionType sessionType;  // Enum for session types
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
    @Column(name = "approved_by")
    private String approvedBy;
    @Column(name = "version")
    private Long version;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Foreign key mapping to User entity
}
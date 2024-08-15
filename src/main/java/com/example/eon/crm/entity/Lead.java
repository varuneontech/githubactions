package com.example.eon.crm.entity;

import com.example.eon.crm.enums.Branch;
import com.example.eon.crm.enums.Coach;
import com.example.eon.crm.enums.LeadStage;
import com.example.eon.crm.enums.PackageEnquired;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "leads")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lead_id")
    private Long leadsId;
    @Column(name = "leads_name", nullable = false)
    private String leadsName;
    @Column(name = "leads_mobile", nullable = false)
    private String leadsMobile;
    @Enumerated(EnumType.STRING)
    @Column(name = "current_stage", nullable = false)
    private LeadStage currentStage;
    @Temporal(TemporalType.DATE)
    @Column(name = "dob", nullable = false)
    private Date dob;
    @Enumerated(EnumType.STRING)
    @Column(name = "branch", nullable = false)
    private Branch branch;
    @Enumerated(EnumType.STRING)
    @Column(name = "attended_coach")
    private Coach atendedCoach;
    @Enumerated(EnumType.STRING)
    @Column(name = "package_enquired")
    private PackageEnquired packageEnquired;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "source")
    private String source;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date", nullable = false)
    private Date updatedDate;
    @Version
    @Column(name = "version", nullable = false)
    private Long version;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}

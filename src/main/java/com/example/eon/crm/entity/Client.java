package com.example.eon.crm.entity;

import com.example.eon.crm.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "client_name", nullable = false)
    private String clientName;
    @Column(name = "client_mobilenumber", nullable = false)
    private String clientMobileNumber;
    @Column(name = "client_optionalnumber")
    private String clientOptionalNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "client_source")
    private ClientSource clientSource;
    @Temporal(TemporalType.DATE)
    @Column(name = "client_dob")
    private Date clientDob;
    @Enumerated(EnumType.STRING)
    @Column(name = "client_gender")
    private Gender clientGender; // You need to define this enum separately
    @Enumerated(EnumType.STRING)
    @Column(name = "client_branch")
    private Branch clientBranch; // You need to define this enum separately
    @Enumerated(EnumType.STRING)
    @Column(name = "client_packageenquired")
    private PackageEnquired clientPackageEnquired;
    @Enumerated(EnumType.STRING)
    @Column(name = "client_currentstage")
    private ClientStage clientCurrentStage;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
    @Version
    @Column(name = "version", nullable = false)
    private Long version;
    @ManyToOne
    @JoinColumn(name = "client_salesperson")
    private User clientSalesperson;
}

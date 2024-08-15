package com.example.eon.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "package")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id")
    private Long packageId;

    @Column(name = "package_amount")
    private Double packageAmount;

    @Column(name = "package_code")
    private String packageCode;

    @Column(name = "package_discounts")
    private Integer packageDiscounts;

    @Column(name = "package_duration")
    private Double packageDuration;

    @Column(name = "package_frequency")
    private String packageFrequency;

    @Column(name = "package_name")
    private String packageName;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "version")
    private Long version;

    @Column(name = "no_of_sessions")
    private Integer noOfSessions;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;
}

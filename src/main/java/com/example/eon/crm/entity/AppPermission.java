package com.example.eon.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Appermissison")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private Long permissionId;
    @Column(name = "permission_name")
    private String permissionName;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;
    @Column(name = "version")
    private Long version;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "modified_by")
    private String modifiedBy;
    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles;  // Many-to-many relationship with Role
}

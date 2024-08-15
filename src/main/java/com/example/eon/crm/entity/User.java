package com.example.eon.crm.entity;

import com.example.eon.crm.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "user_email", nullable = false, unique = true)
    private String userEmail;
    @Column(name = "user_phone", nullable = false, unique = true)
    private String userPhone;
    @Column(name = "user_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @Column(name = "last_login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    @Column(name = "created_date", updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "updated_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "version", nullable = false)
    @Version
    private Long version;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lead> leads;
    @OneToMany(mappedBy = "clientSalesperson", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;
    @OneToMany(mappedBy = "user")
    private Set<Attendance> attendances;
    @OneToMany(mappedBy = "user")
    private Set<Chat> chats;  // One-to-many relationship with Chat
    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;  // Many-to-many relationship with Role
}

//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/varuneontech/githubactions.git
//git push -u origin main
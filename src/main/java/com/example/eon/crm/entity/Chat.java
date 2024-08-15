package com.example.eon.crm.entity;

import com.example.eon.crm.enums.ChatStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "chats")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long chatId;
    @Column(name = "chat_session_id")
    private String chatSessionId;
    @Column(name = "chat_transcript")
    private String chatTranscript;
    @Enumerated(EnumType.STRING)
    @Column(name = "chat_status")
    private ChatStatus chatStatus;  // Enum for chat statuses
    @Temporal(TemporalType.DATE)
    @Column(name = "chat_date")
    private Date chatDate;
    @Temporal(TemporalType.TIME)
    @Column(name = "chat_time")
    private Date chatTime;
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
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Foreign key mapping to User entity
}

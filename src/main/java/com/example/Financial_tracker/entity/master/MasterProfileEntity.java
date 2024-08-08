package com.example.Financial_tracker.entity.master;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tb_m_profile")
public class MasterProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @OneToOne(mappedBy = "profile")
    private MasterUserEntity user;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private MasterJobEntity job;
}

package com.example.Financial_tracker.entity.master;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_m_job")
public class MasterJobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Column(name = "is_enabled")
    private Boolean isEnabled;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @OneToMany(mappedBy = "job")
    private List<MasterProfileEntity> profile;
}

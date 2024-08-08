package com.example.Financial_tracker.entity.master;

import com.example.Financial_tracker.entity.transaction.MonthlyTsxEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_m_user")
public class MasterUserEntity {
    @Id
    private String id;
    private String username;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String password;
    private Boolean is_deleted;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @OneToMany(mappedBy = "user")
    private List<MonthlyTsxEntity> monthlyTsx;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private MasterProfileEntity profile;
}

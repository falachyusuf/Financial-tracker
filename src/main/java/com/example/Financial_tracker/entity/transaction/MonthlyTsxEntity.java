package com.example.Financial_tracker.entity.transaction;

import com.example.Financial_tracker.entity.master.MasterMonthEntity;
import com.example.Financial_tracker.entity.master.MasterUserEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_tr_monthly_transaction")
public class MonthlyTsxEntity {
    @Id
    private String id;
    private long expanse;
    private Boolean is_deleted;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @ManyToOne
    @JoinColumn(name = "user_id")
    private MasterUserEntity user;

    @OneToOne(mappedBy = "month")
    private MasterMonthEntity month;

    @OneToMany(mappedBy = "monthlyTsx")
    private List<DailyTsxEntity> dailyTsx;
}

package com.example.Financial_tracker.entity.transaction;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tb_tr_daily_transaction")
public class DailyTsxEntity {
    @Id
    private String id;
    private Long expanse;
    @Column(name = "tsx_date")
    private Date tsxDate;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @ManyToOne
    @JoinColumn(name ="monthly_tsx_id")
    private MonthlyTsxEntity monthlyTsx;
}

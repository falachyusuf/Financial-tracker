package com.example.Financial_tracker.entity.master;

import com.example.Financial_tracker.entity.transaction.MonthlyTsxEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_m_month")
public class MasterMonthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer name;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @OneToOne
    @JoinColumn(name = "month_id")
    private MonthlyTsxEntity month;

    @OneToMany(mappedBy = "month")
    private List<MasterMonthlySaldoEntity> monthlySaldo;
}

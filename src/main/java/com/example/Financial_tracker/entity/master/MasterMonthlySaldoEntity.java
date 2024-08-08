package com.example.Financial_tracker.entity.master;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_m_monthly_saldo")
public class MasterMonthlySaldoEntity {
    @Id
    private String id;
    private String totalSaldo;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @OneToMany(mappedBy = "monthlySaldo")
    private List<MasterSaldoOriginEntity> saldoOrigin;

    @ManyToOne
    @JoinColumn(name = "bulan_id")
    private MasterMonthEntity month;
}

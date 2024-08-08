package com.example.Financial_tracker.entity.master;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tb_m_saldo_origin")
public class MasterSaldoOriginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long saldo;
    @Column(name = "is_enabled")
    private Boolean isEnabled;
    private Date created;
    private Date updated;
    private Date deleted;

    // Constrain
    @ManyToOne
    @JoinColumn(name = "monthly_saldo_id")
    private MasterMonthlySaldoEntity monthlySaldo;
}

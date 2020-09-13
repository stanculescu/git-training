package com.worldpay.tmd.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "release")
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_release")
    @SequenceGenerator(name = "seq_release", sequenceName = "seq_release", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Temporal(TemporalType.DATE)
    @Column(name = "code_freeze_date")
    private LocalDate codeFreezeDate;

//    @Temporal(TemporalType.DATE)
    @Column(name = "release_date")
    private LocalDate releaseDate;
}

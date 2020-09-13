package com.worldpay.tmd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@ToString(exclude = {"project"})
@EqualsAndHashCode(exclude = {"project"})
@Entity
@Table(name = "sonar")
public class Sonar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sonar")
    @SequenceGenerator(name = "seq_sonar", sequenceName = "seq_sonar", allocationSize = 1)
    @Column(name = "id")
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "project_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Project project;

    @Column(name = "lines_to_cover")
    private Long linesToCover;

    @Column(name = "uncovered_lines")
    private Long uncoveredLines;

    @Column(name = "conditions_to_cover")
    private Long conditionsToCover;

    @Column(name = "uncovered_conditions")
    private Long uncoveredConditions;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}

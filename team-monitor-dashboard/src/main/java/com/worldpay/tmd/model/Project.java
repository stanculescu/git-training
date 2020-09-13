package com.worldpay.tmd.model;

import lombok.Data;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_project")
    @SequenceGenerator(name = "seq_project", sequenceName = "seq_project", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Team team;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "current_tag")
    private String currentTag;

    @Column(name = "is_deployed")
    private Boolean is_deployed;

//    @Temporal(TemporalType.DATE)
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Column(name = "up_to_date")
    private boolean upToDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "project")
    private Set<Sonar> sonar;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "project")
    private Set<JenkinsBuild> jenkinsBuild;
}

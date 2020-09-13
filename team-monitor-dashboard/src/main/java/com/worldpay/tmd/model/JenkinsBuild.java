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

@Data
@ToString(exclude = {"project"})
@EqualsAndHashCode(exclude = {"project"})
@Entity
@Table(name = "jenkins_build")
public class JenkinsBuild {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_jenkins_build")
    @SequenceGenerator(name = "seq_jenkins_build", sequenceName = "seq_jenkins_build", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "project_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Project project;

    @Column(name = "number")
    private Integer number;

    @Column(name = "build_success")
    private boolean buildSuccess;
}

package com.worldpay.tmd.repository;

import com.worldpay.tmd.model.Release;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.management.relation.Relation;
import java.time.LocalDate;
import java.util.List;

public interface ReleaseRepository extends JpaRepository<Release, Long> {

    @Query(value = "SELECT top 1 * FROM RELEASE r WHERE r.CODE_FREEZE_DATE >= CURRENT_DATE()", nativeQuery = true)
    Release findNextRelease();
}

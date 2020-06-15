package com.rach.mission.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MissionRepository extends CrudRepository<Mission, Long> {
    @Query("SELECT m FROM Mission m WHERE m.title LIKE CONCAT('%',:title,'%')")
    List<Mission> findByTitle(@Param("title") String title);
    @Query("SELECT m FROM Mission m WHERE m.content LIKE CONCAT('%',:content,'%')")
    List<Mission> findByContent(@Param("content") String content);
}

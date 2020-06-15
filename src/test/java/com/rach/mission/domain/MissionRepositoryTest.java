package com.rach.mission.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class MissionRepositoryTest {
    @Autowired
    private MissionRepository missions;

    @Test
    void save() {
        final Mission expected = new Mission(1L, "티켓팅 대리 구해요.", "오페라의유령 8/12 예매 대리 부탁드립니다.", 50000);
        final Mission actual = missions.save(expected);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void findByAuthorId() {
        final Mission expected = new Mission(1L, "티켓팅 대리 구해요.", "오페라의유령 8/12 예매 대리 부탁드립니다.", 50000);
        missions.save(expected);

        final List<Mission> actual = missions.findByTitle("티켓팅");
        System.out.println(actual + " <<<<<<<<<<<<<<<");
        assertThat(actual.contains(expected)).isTrue();
    }


    @Test
    void findByAuthorName() {
        final Mission expected = new Mission(1L, "티켓팅 대리 구해요.", "오페라의유령 8/12 예매 대리 부탁드립니다.", 50000);
        missions.save(expected);

        final List<Mission> actual = missions.findByContent("오페라의유령");
        assertThat(actual.contains(expected)).isTrue();
    }

}

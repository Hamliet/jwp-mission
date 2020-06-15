package com.rach.mission.domain;

import javax.persistence.*;

@Entity
@Table(name = "mission")
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "author")
    private Long author;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "reward", nullable = false)
    private int reward;

    protected Mission() {
    }

    public Mission(Long author,String title, String content, int reward) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.reward = reward;
    }

    public Long getAuthor() {
        return author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getReward() {
        return reward;
    }
}

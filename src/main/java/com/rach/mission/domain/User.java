package com.rach.mission.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class User {
    @Id
    String Id;
    @Column(name = "user_email", nullable = false)
    private String userEmail;
    @Column(name = "user_name", nullable = false)
    private String userName;
}

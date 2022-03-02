package com.sha.springbootbookseller.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

//tüm degiskenler private modda old. getter,setter tanimlanmali. getter,setter getiren lombok anatasyonu @DATA

@Data
@Entity
@Table (name = "users") //user adı database icin ayrilmis ozel addir
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //her yeni eklemede ona numara verir IDENTITY
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;


}

package com.sha.springbootbookseller.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //tüm degiskenler private modda old. getter,setter tanimlanmali. getter,setter getiren lombok anatasyonu @DATA
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    //kitap no

    @Column(name = "title", nullable = false, length = 100)
    private String title;   //kitap adi

    @Column(name = "description", nullable = false, length = 1000)
    private String description;     //kitap aciklamasi

    @Column(name = "author", nullable = false, length = 100)
    private String author;      //kitap yazari

    @Column(name = "price", nullable = false)
    private Double price;       //kitap fiyat

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;   //debug zamanı

}

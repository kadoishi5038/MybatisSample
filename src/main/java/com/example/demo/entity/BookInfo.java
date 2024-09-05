package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class BookInfo implements Serializable {

    /**
     * isbn
     */
    private String isbn;

    /**
     * タイトル
     */
    private String title;

    /**
     * 値段
     */
    private Integer price;

    /**
     * 本
     */
    private String name;

    /**
     * id
     */
    private Long id;
}
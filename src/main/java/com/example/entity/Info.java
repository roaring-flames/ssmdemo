package com.example.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Info implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private static final long serialVersionUID = 1L;


}
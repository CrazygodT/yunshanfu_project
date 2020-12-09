package com.qf.pojo;

import lombok.Data;

@Data
public class User {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Integer uid;

    /*@Column(name = "user_tel")*/
    private String userTel;

    /*@Column(name = "pass_word")*/
    private String passWord;

    private String info;

    private String codes;

    private String email;
}

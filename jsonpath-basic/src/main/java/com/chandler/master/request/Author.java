package com.chandler.master.request;

import lombok.Getter;

@Getter
public class Author {

    private Long id;
    private String name;
    private String phoneNumber;

    public Author(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


}

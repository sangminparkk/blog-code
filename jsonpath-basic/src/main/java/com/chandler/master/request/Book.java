package com.chandler.master.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {

    private Long id;
    private String title;
    private List<Author> authors;
    private Map<String, String> meta;

}

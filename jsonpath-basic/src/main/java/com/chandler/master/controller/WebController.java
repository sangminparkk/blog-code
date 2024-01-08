package com.chandler.master.controller;

import com.chandler.master.request.Author;
import com.chandler.master.request.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class WebController {

    /**
     * {
     *      "id" : 1,
     *      "title" : "Spring",
     *      "authors" : [ {
     *                   "id" : 1,
     *                   "name" : "작가A"
     *                   "phoneNumber: "111-1111111"}]
     *      "meta" :
     *              {"isbn-10" : "1617293563",
     *              ...}
     *
     * }
     */

    @GetMapping("/book")
    public Book returnBook() {

        Author obj1 = new Author(1L, "작가A", "111-1111111");
        Author obj2 = new Author(2L, "작가B", "222-2222222");
        Author obj3 = new Author(3L, "작가C", "333-3333333");

        Book book = new Book();

        book.setId(1L);
        book.setTitle("Spring");
        book.setAuthors(List.of(obj1, obj2, obj3));
        book.setMeta(Map.of("isbn-10", "1617293563", "isbn-13", "978-1617293566"));

        log.info("book={}", book.toString());
        return book;
    }

}

package com.bo.service;

import com.bo.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookService {

    public static List<Book> init() {
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "亚瑟", "1.jpg", "Saber"),
                new Book(2, "岩窟王", "2.jpg", "Avenger"),
                new Book(3, "福尔摩斯", "3.jpg", "Ruler"),
                new Book(4, "库丘林", "4.jpg", "Berserker"),
                new Book(5, "吉尔伽美什", "5.jpg", "Archer"),
                new Book(6, "亚瑟", "1.jpg", "Saber"),
                new Book(7, "岩窟王", "2.jpg", "Avenger"),
                new Book(8, "福尔摩斯", "3.jpg", "Ruler"),
                new Book(9, "库丘林", "4.jpg", "Berserker"),
                new Book(10, "吉尔伽美什", "5.jpg", "Archer"),
                new Book(11, "亚瑟", "1.jpg", "Saber"),
                new Book(12, "吉尔伽美什", "5.jpg", "Archer")

        };
        bookList = Arrays.asList(books);
        return bookList;
    }

    public static void main(String[] args) {
        List<Book> bookList = BookService.init();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }


}

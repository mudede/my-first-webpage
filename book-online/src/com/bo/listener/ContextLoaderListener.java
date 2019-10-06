package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * @Description 容器初始化方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "咕哒子", "user1.jpg", "江苏南京", LocalDate.of(2018, 6, 11)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "咕哒夫", "user2.jpg", "浙江杭州", LocalDate.of(2019, 2, 18)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "白野", "user3.jpg", "湖北武汉", LocalDate.of(2019, 8, 19))
        };
        userList = Arrays.asList(users);

        //创建并生成图书数据列表
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
        bookList = Arrays.asList(books);

        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
    }

    /**
     * 销毁方法
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

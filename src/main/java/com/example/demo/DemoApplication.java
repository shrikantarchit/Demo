package com.example.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

 

private static final String p = "123456"; // hard-coded credential

public static void main(String[] args) throws SQLException {SpringApplication.run(DemoApplication.class, args);
    String url = "jdbc:mysql://localhost/test";
    String u = "admin"; // hard-coded credential

    getConn(url, u, p);
}
@GetMapping("/api")
public static void getConn(String url, String v, String q) throws SQLException {
    DriverManager.getConnection(url, v, q); // sensitive call
}

	
}

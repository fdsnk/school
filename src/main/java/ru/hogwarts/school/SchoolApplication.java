package ru.hogwarts.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

    // Добавить swagger к проекту. Для этого добавить зависимость к проекту.

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }

}

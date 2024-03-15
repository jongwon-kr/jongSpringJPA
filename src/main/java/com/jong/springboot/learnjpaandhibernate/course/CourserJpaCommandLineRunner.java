package com.jong.springboot.learnjpaandhibernate.course;

import com.jong.springboot.learnjpaandhibernate.course.Course;
import com.jong.springboot.learnjpaandhibernate.course.jdbc.CourseJdbbcRepository;
import com.jong.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourserJpaCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbbcRepository repository;

//    @Autowired
//    private CourseJdbbcRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS JPA","in28minutes"));
        repository.save(new Course(2, "Learn Azure JPA","in28minutes"));
        repository.save(new Course(3, "Learn DevOps JPA","in28minutes"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}

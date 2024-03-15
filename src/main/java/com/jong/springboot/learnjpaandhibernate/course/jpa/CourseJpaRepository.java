package com.jong.springboot.learnjpaandhibernate.course.jpa;

import com.jong.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.IconUIResource;

//JPA
@Repository
@Transactional
public class CourseJpaRepository {

    private EntityManager entityManager;

    @Autowired
    public CourseJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}

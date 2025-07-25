package com.wdd.studentmanager.service;

import com.wdd.studentmanager.domain.Course;
import com.wdd.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname CourseService
 * @Description None
 * @Date 2024/6/29 20:09
 * 
 */
public interface CourseService {
    PageBean<Course> queryPage(Map<String, Object> paramMap);

    int addCourse(Course course);

    int editCourse(Course course);

    int deleteCourse(List<Integer> ids);

    List<Course> getCourseById(List<Integer> ids);

    int findByName(String name);
}

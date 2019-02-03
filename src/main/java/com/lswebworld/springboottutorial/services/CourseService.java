package com.lswebworld.springboottutorial.services;

import com.lswebworld.springboottutorial.dataobjects.Course;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

  @Autowired
  private ICourseRepository courseRepository;

  /**
   * Returns all Courses.
   * @return Courses.
   */
  public List<Course> getAllCourses(String topicId) {
    List<Course> courses = new ArrayList<Course>();
    courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
    return courses;
  }

  /**
   * Adds a Course.
   * @param course Course.
   */
  public void addCourse(Course course) {
    courseRepository.save(course);
  }

  /**
   * Updates a Course.
   * @param course Course.
   */
  public void updateCourse(Course course) {
    courseRepository.save(course);
  }

  /**
   * Gets a Course by Id.
   * @param id Id.
   * @return Course.
   */
  public Course getCourse(String id) {
    return courseRepository.findById(id).orElse(new Course());
  }

  /**
   * Deletes a Course.
   * @param id Id.
   */
  public void deleteCourse(String id) {
    courseRepository.deleteById(id);
  }
}
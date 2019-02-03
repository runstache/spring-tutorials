package com.lswebworld.springboottutorial.controllers;

import com.lswebworld.springboottutorial.dataobjects.Course;
import com.lswebworld.springboottutorial.dataobjects.Topic;
import com.lswebworld.springboottutorial.services.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

  @Autowired
  private CourseService courseService;

  /**
   * Retruns all the Courses a for a Topic.
   * @param topicId Topic Id.
   * @return Course.
   */
  @RequestMapping("/topics/{topicId}/courses")
  public List<Course> getAllCourses(@PathVariable String topicId) {
    return courseService.getAllCourses(topicId);
  }

  /**
   * Retrieves a Course from a Topic.
   * @param id Course Id.
   * @return Course.
   */
  @RequestMapping("/topics/{topicId}/courses/{id}")
  public Course getCourse(@PathVariable String id) {
    return courseService.getCourse(id);
  }

  /**
   * Adds a new Course to a Topic.
   * @param course Course.
   * @param topicId Topic Id.
   */
  @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
  public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
    course.setTopic(new Topic(topicId, "", ""));
    courseService.addCourse(course);
  }

  /**
   * Updates a Course.
   * @param course Course.
   * @param id Course Id. 
   * @param topicId Topic Id.
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
  public void updateCourse(@RequestBody Course course, 
      @PathVariable String id, @PathVariable String topicId) {

    if (course.getId() == null) {
      course.setId(id);
    }
    course.setTopic(new Topic(topicId, "", ""));
    courseService.updateCourse(course);
  }

  /**
   * Deletes a Course from a Topic.
   * @param id Course Id
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
  public void deleteCourse(@PathVariable String id) {
    courseService.deleteCourse(id);
  }
}
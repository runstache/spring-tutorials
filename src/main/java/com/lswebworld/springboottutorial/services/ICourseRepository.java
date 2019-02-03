package com.lswebworld.springboottutorial.services;

import com.lswebworld.springboottutorial.dataobjects.Course;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ICourseRepository extends CrudRepository<Course, String> {

  public List<Course> findByTopicId(String topicId);

}
package com.lswebworld.springboottutorial.services;

import com.lswebworld.springboottutorial.dataobjects.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

  @Autowired
  private ITopicRepository topicRepository;

  /**
   * Returns all the Topics from the Database.
   * @return List of Topics.
   */
  public List<Topic> getAllTopics() {
    List<Topic> topics = new ArrayList<Topic>();
    topicRepository.findAll()
      .forEach(topics::add);
    return topics;
  }

  /**
   * Returns a Topic from the Database.
   * @param id Id
   * @return Topic.
   */
  public Topic getTopic(String id) {
    return topicRepository.findById(id).orElse(new Topic());
  }

  /**
   * Adds a Topic to the Database.
   * @param topic Topic.
   */
  public void addTopic(Topic topic) {
    topicRepository.save(topic);
  }

  /**
   * Updates a Topic.
   * @param topic Topic
   */
  public void updateTopic(Topic topic) {
    topicRepository.save(topic);
  }

  /**
   * Removes the Topic from the Database.
   * @param id ID.
   */
  public void deleteTopic(String id) {
    topicRepository.deleteById(id);
  }
}
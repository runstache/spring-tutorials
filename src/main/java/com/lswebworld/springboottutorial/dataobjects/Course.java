package com.lswebworld.springboottutorial.dataobjects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

  @Id
  private String id;
  private String name; 
  private String description;

  @ManyToOne
  private Topic topic;

  public Course() {

  }

  /**
   * Constructor.
   * @param id id
   * @param name name
   * @param description description
   */
  public Course(String id, String name, String description, String topicId) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.topic = new Topic(topicId,"","");
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Topic getTopic() {
    return topic;
  }

  public void setId(final String value) {
    id = value;
  }

  public void setName(final String value) {
    name = value;
  }

  public void setDescription(final String value) {
    description = value;
  }

  public void setTopic(final Topic value) {
    topic = value;
  }  

}
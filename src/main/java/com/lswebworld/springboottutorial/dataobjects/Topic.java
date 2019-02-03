package com.lswebworld.springboottutorial.dataobjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

  @Id
  private String id;
  private String name;
  private String description;

  //#region Constructors
  public Topic() {
  }

  /**
   * Creates new Topic with Args.
   * @param id Id
   * @param name Name
   * @param description description
   */
  public Topic(String id, String name, String description) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
  }

  //#endregion

  //#region Getters
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  //#endregion

  //#region Setters
  
  public void setId(final String value) {
    id = value;
  }

  public void setName(final String value) {
    name = value;
  }

  public void setDescription(final String value) {
    description = value;
  }

  //#endregion
}
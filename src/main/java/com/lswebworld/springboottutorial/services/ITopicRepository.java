package com.lswebworld.springboottutorial.services;

import com.lswebworld.springboottutorial.dataobjects.Topic;

import org.springframework.data.repository.CrudRepository;

public interface ITopicRepository extends CrudRepository<Topic, String> {

  

}
package com.genspark.practice.Service;

import com.genspark.practice.Entity.MyEntity;

import java.util.List;

public interface MyService {

    List<MyEntity> getAllEntities();
    MyEntity getEntityById(int myId);
    MyEntity addEntity(MyEntity myEntity);
    MyEntity updateEntity(MyEntity myEntity);
    String deleteEntityById(int myId);

}

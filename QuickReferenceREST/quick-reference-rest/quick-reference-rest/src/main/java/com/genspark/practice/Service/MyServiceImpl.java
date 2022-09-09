package com.genspark.practice.Service;

import com.genspark.practice.Dao.MyDao;
import com.genspark.practice.Entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyDao myDao;

    @Override
    public List<MyEntity> getAllEntities() {
        return this.myDao.findAll();
    }

    @Override
    public MyEntity getEntityById(int myId) {
        Optional<MyEntity> e = this.myDao.findById(myId);
        MyEntity myEntity = null;

        if (e.isPresent()) {
            myEntity = e.get();
        } else {
            throw new RuntimeException(" Entity not found for id :: " + myId);
        }

        return myEntity;
    }

    @Override
    public MyEntity addEntity(MyEntity myEntity) {
        return this.myDao.save(myEntity);
    }

    @Override
    public MyEntity updateEntity(MyEntity myEntity) {
        return this.myDao.save(myEntity);
    }

    @Override
    public String deleteEntityById(int myId) {
        this.myDao.deleteById(myId);
        return "Entity deleted successfully";
    }

}

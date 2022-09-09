package com.genspark.practice.Dao;

import com.genspark.practice.Entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDao extends JpaRepository<MyEntity, Integer> {
}

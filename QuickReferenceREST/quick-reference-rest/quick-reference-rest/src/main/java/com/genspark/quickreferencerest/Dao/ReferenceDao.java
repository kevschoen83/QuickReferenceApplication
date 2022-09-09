package com.genspark.quickreferencerest.Dao;

import com.genspark.quickreferencerest.Entity.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceDao extends JpaRepository<Reference, Integer> {
}

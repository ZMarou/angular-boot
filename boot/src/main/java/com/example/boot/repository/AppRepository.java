package com.example.boot.repository;

import com.example.boot.model.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<AppEntity, Long> {
    AppEntity getByAppId(long appId);
}

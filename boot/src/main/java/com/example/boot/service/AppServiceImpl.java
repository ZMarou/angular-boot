package com.example.boot.service;

import com.example.boot.model.AppEntity;
import com.example.boot.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService{

    private AppRepository appRepository;

    @Autowired
    public AppServiceImpl(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    @Override
    public long add(long appId) {
        AppEntity appEntity = appRepository.getByAppId(appId);
        appEntity.setVersion((appEntity.getVersion() != null ? appEntity.getVersion() : 0) +1);
        return appRepository.save(appEntity).getVersion();
    }
}

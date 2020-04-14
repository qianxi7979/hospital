package com.hospital.service;

import com.hospital.entity.Storage;
import com.hospital.mapper.StorageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StorageServiceImpl implements StorageService{
    @Resource
    StorageMapper storageMapper;

    @Override
    public List<Storage> storList(Integer status, String type, String code) {
        return storageMapper.storList(status,type,code);
    }
}

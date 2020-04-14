package com.hospital.service;

import com.hospital.entity.Medicine;
import com.hospital.mapper.MediMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MediServiceImpl implements MediService{

    @Resource
    MediMapper mediMapper;

    @Override
    public List<Medicine> mediList(Integer type, String name) {
        return mediMapper.mediList(type,name);
    }
}

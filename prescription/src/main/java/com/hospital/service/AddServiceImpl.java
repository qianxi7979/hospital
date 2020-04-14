package com.hospital.service;

import com.hospital.entity.Additional;
import com.hospital.mapper.AddMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddServiceImpl implements AddService{
    @Resource
    AddMapper addMapper;

    @Override
    public List<Additional> addList() {
        return addMapper.addList();
    }
}

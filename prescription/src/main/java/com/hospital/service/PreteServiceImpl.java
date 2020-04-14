package com.hospital.service;

import com.hospital.entity.Pretemplate;
import com.hospital.entity.West;
import com.hospital.mapper.PreteMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PreteServiceImpl implements PreteService{

    @Resource
    PreteMapper preteMapper;


    @Override
    public List<West> preteDetailInfo(Integer pId) {
        return preteMapper.preteDetailInfo(pId);
    }


    @Override
    public List<Pretemplate> showInfo(String type,String permission,String code) {
       return preteMapper.showInfo(type,permission,code);
    }

}

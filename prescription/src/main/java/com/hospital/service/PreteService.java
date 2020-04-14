package com.hospital.service;

import com.hospital.entity.Pretemplate;
import com.hospital.entity.West;

import java.util.List;

public interface PreteService {

    List<Pretemplate> showInfo(String type,String permission,String code);


    List<West> preteDetailInfo(Integer pId);
}

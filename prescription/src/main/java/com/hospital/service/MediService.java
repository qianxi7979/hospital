package com.hospital.service;

import com.hospital.entity.Medicine;

import java.util.List;

public interface MediService {

    List<Medicine> mediList(Integer type,String name);
}

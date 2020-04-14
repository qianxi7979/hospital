package com.hospital.service;

import com.hospital.entity.Storage;

import java.util.List;

public interface StorageService {

    List<Storage> storList (Integer status,String type,String code);
}

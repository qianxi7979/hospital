package com.hospital.mapper;

import com.hospital.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StorageMapper {

    List<Storage> storList (@Param("status")Integer status,@Param("type")String type,
                            @Param("code")String code);
}

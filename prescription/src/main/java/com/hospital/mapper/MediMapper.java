package com.hospital.mapper;

import com.hospital.entity.Medicine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MediMapper {

    List<Medicine> mediList(@Param("type")Integer type,@Param("name")String name);
}

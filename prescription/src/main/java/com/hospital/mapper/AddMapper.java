package com.hospital.mapper;

import com.hospital.entity.Additional;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddMapper {

    public List<Additional> addList();
}

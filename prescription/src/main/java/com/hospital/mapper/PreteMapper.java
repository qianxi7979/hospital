package com.hospital.mapper;

import com.hospital.entity.Pretemplate;
import com.hospital.entity.West;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface PreteMapper {

    /**
     * 根据条件分页查询模板信息
     * @param type
     * @param permission
     * @param code
     * @return
     */
    List<Pretemplate> showInfo(@Param("type")String type,
                               @Param("permission")String permission,
                               @Param("code")String code);


    List<West> preteDetailInfo(@Param("pId")Integer pId);
}

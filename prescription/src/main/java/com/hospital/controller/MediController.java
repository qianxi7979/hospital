package com.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.entity.Medicine;
import com.hospital.service.MediServiceImpl;
import com.utils.response.Response;
import com.utils.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "药品信息")
@RequestMapping("/api/medicine")
public class MediController {

    @Resource
    MediServiceImpl mediService;

    @ApiOperation(value = "查询药品信息",notes = "根据条件查询信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "type",value = "药品类型",required = false),
            @ApiImplicitParam(paramType = "query",name = "name",value = "药品名称",required = false)
    })
    @GetMapping("/findBy")
    public Response medicineList(@RequestParam(value = "type",required = false) Integer type,
                                 @RequestParam(value = "name",required = false)String name,
                                 Integer pageNo,Integer pageSize){
        if(pageNo==null || pageNo==0){
            pageNo=1;
        }
        PageHelper.startPage(pageNo,pageSize);
        List<Medicine> medicineList =mediService.mediList(type,name);
        PageInfo<Medicine> pageInfo =new PageInfo<>(medicineList);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

}

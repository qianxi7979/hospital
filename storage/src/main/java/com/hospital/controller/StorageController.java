package com.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.entity.Storage;
import com.hospital.service.StorageServiceImpl;
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
@Api(tags = "入库管理接口")
@RequestMapping("/api/storage")
public class StorageController {

    @Resource
    StorageServiceImpl storageService;

    @ApiOperation(value = "查询入库信息",notes = "根据条件查询入库信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "status",value = "状态",required = false),
            @ApiImplicitParam(paramType = "query",name = "type",value = "入库类型",required = false),
            @ApiImplicitParam(paramType = "query",name = "code",value = "编码或厂商",required = false)
    })
    @GetMapping("/findBy")
    public Response list(@RequestParam(value = "status",required = false)Integer status,
                         @RequestParam(value = "type",required = false)String type,
                         @RequestParam(value = "code",required = false)String code,Integer pageNo,Integer pageSize){
        if(pageNo==null || pageNo==0){
            pageNo=1;
        }
        PageHelper.startPage(pageNo,pageSize);
        List<Storage> list =storageService.storList(status,type,code);
        PageInfo<Storage> pageInfo =new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}

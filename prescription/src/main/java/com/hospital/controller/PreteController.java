package com.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.entity.Pretemplate;
import com.hospital.entity.West;
import com.hospital.service.PreteServiceImpl;
import com.utils.response.Response;
import com.utils.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@Api(tags = "处方模板接口")
@RequestMapping("/api/prete")
public class PreteController {

    @Autowired
    PreteServiceImpl preteService;

    @ApiOperation(value = "查询处方",notes = "根据条件查询处方")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "type",value = "处方类型",required = false),
            @ApiImplicitParam(paramType = "query",name = "permission",value = "模板权限",required = false),
            @ApiImplicitParam(paramType = "query",name = "code",value = "模板名称或编码",required = false),
            @ApiImplicitParam(paramType = "query",name = "pageNo",value = "初始页面",required = false,defaultValue ="1"),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "每页条数",required = false,defaultValue = "1")
    })
    @GetMapping("/prete")
    public Response getPreteInfo(@RequestParam(value = "type",required = false)String type,
                                 @RequestParam(value = "permission",required = false)String permission,
                                 @RequestParam(value = "code",required = false)String code,
                                 Integer pageNo,Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Pretemplate> infoList =preteService.showInfo(type,permission,code);
        PageInfo<Pretemplate> pageInfo =new PageInfo<>(infoList);
        return  new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }


    @ApiOperation(value = "查询模板详情",notes = "根据模板id查询模板详情")
    @ApiImplicitParam(paramType = "path",name = "pId",value = "模板id",required = true)
    @GetMapping("/west/{pId}")
    public  Response selectById(@PathVariable("pId")Integer pId){
        West west =new West();
        List<West> westList = preteService.preteDetailInfo(pId);
        for (int i=0;i<westList.size();i++){
            west =westList.get(i);
            System.out.println("总量==="+west.getTotal());
            System.out.println("售价"+west.getmSell());
            west.setmSell(west.getTotal()*west.getmSell());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(westList);
    }
}

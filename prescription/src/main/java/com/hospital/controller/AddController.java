package com.hospital.controller;

import com.hospital.entity.Additional;
import com.hospital.service.AddService;
import com.utils.response.Response;
import com.utils.response.ResponseEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/add")
public class AddController {
    @Resource
    AddService addService;

    @GetMapping("/addList")
    public Response addList(){
        List<Additional> additionalList =addService.addList();
        return new Response(ResponseEnum.SUCCESS).setResponseBody(additionalList);
    }
}

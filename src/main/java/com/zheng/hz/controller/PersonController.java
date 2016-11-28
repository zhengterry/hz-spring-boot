package com.zheng.hz.controller;

import com.zheng.hz.api.model.PersonVO;
import com.zheng.hz.api.service.PersonService;
import com.zheng.infras.springboot.dubbo.annotation.Dsrv;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/20/020.
 */
@RestController
@RequestMapping("/hz")
public class PersonController {

    @Dsrv
    private PersonService personService;

    @RequestMapping("/get/{id}")
    public PersonVO get(@PathVariable("id")Long id){
        PersonVO p = personService.get(id);
        return p;
    }
}


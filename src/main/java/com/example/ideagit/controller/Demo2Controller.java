package com.example.ideagit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author mi_huaian.kang 2022/08/30 11:15
 */
@Slf4j
@RestController
@RequestMapping("demo2")
public class Demo2Controller {

    @PostMapping("demo1")
    public String demo1(String name) {
        log.info("name:{}", name);
        return name;
    }

    @PostMapping("demo2")
    public String demo2(String name, Integer age) {
        return name;
    }

}

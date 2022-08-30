package com.example.ideagit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author mi_huaian.kang 2022/08/30 11:12
 */
@Slf4j
@RestController
@RequestMapping("kang")
public class DemoController {

    @PostMapping("demo1")
    public String demo1(String name) {
        return name;
    }

}

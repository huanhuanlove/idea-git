package com.example.ideagit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 测试程序
 *
 * @author mi_huaian.kang 2022/08/30 11:09
 */
@Slf4j
@RestController
@RequestMapping("kang")
public class KangController {

    @PostMapping("demo1")
    public String demo1(String name) {
        log.info("参数为：{}", name);
        return name;
    }

    @PostMapping("demo2")
    public String demo2(String name) {
        log.info("参数name：{}", name);
        return name;
    }

    @PostMapping("demo3 ")
    public String demo3(String name) {
        log.info("name3:{}", name);
        return name;
    }
}

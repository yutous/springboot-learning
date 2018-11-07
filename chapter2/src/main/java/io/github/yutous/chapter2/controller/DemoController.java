package io.github.yutous.chapter2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个spring boot
 * @author yutou
 * @date 2018/11/7
 * @since 1.0.0
 */
@RestController
public class DemoController {

    @Value("${spring.profiles.active}")
    String profile;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        StringBuffer sb = new StringBuffer();
        return sb.append("启动环境profile：").append(profile).toString();
    }
}

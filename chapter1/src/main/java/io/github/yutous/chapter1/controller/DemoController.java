package io.github.yutous.chapter1.controller;

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
    @Value("${blog.address}")
    String address;
    @Value("${blog.author}")
    String author;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        StringBuffer sb = new StringBuffer();
        return sb.append(author).append("的博客地址：").append(address).toString();
    }
}

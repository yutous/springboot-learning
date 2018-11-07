package io.github.yutous.chapter2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@Slf4j
public class Chapter2Application {

    public static void main(String[] args) {
        log.info("应用开始启动>>>>>>>>");
        SpringApplication.run(Chapter2Application.class, args);
        log.info("应用启动完成>>>>>>>>");
    }
}

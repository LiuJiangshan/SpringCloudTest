package ljs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${eureka.instance.hostname}")
    String hostName;

    @RequestMapping("hello")
    public String hello() {
        return "hello,I'm " + hostName;
    }
}

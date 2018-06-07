package com.test.ip_test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yang
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        log.info("ip: {}", request.getRemoteAddr());
        return "hello";
    }
}

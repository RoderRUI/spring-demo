package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 刘中睿
 * @Date: 2023/12/18 18:22
 * @Description:
 */

@Controller
public class TestController {
    @GetMapping("/")
    public String showUploadPage() {
        return "upload";
    }
}

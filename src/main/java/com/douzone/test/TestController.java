package com.douzone.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Controller
public class TestController {


    @GetMapping("/")
    public String test(Model model) throws UnknownHostException {

        model.addAttribute("name", "정재빈");
        model.addAttribute("time", LocalDateTime.now());

        InetAddress local = InetAddress.getLocalHost();
        String ip = local.getHostAddress();
        model.addAttribute("ip", ip);

        return "test";
    }

    @GetMapping("/list")
    public String list(Model model) {

        model.addAttribute("list", "list");
        model.addAttribute("test", new Test(1, "정재빈"));
        return "list";
    }

}

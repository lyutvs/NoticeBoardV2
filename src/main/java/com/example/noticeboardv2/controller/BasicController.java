package com.example.noticeboardv2.controller;

import com.example.noticeboardv2.dto.web.BasicResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/hell")
    public String hello() {
        return "Hell";
    }

    @GetMapping("/hell/dto")
    public BasicResponseDTO hellDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new BasicResponseDTO(name, amount);
    }
}

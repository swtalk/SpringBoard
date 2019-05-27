package com.example.board.Controller;

import com.example.board.domain.BoardVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @RequestMapping("/")
    public String test() {
        return "Hello world";
    }

}

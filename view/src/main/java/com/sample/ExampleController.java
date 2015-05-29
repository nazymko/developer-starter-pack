package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nazymko on 5/29/2015.
 */
@Controller
public class ExampleController {
    @RequestMapping("/example")
    public String todo() {
        return "index";
    }
}

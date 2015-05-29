package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nazymko on 15.05.2015.
 */
@Controller
public class SimpleController {

/*    @RequestMapping("/hello")
    public Object someAction() {
        return new Object() {
            public String name = "Andrew";
            public Integer age = 24;
        };
    }*/


    @RequestMapping("/hello")
    public Object someAction() {
     return "default";
    }

}

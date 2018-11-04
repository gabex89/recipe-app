package com.smoothspark.recipeapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SmoothSpark in 04/11/2018
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }
}

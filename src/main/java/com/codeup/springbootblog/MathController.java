package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping(path = "/add/{number}/and/{number2}")
    @ResponseBody
    public String addOne(@PathVariable int number, @PathVariable int number2){
        return number + " plus " + number2 + "is" + (number + number2)+ "!";
    }

    @GetMapping(path = "/subtract/{number}/and/{number2}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int number2){
        return number + " plus " + number2 + "is" + (number - number2)+ "!";
    }

    @GetMapping(path = "/multiply{number}/and/{number2}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int number2){
        return number + " multiplied " + number2 + "is" + (number * number2)+ "!";
    }

    @GetMapping(path = "/divide/{number}/and/{number2}")
    @ResponseBody
    public String divide(@PathVariable int number, @PathVariable int number2){
        return number + " divided by " + number2 + "is" + (number / number2)+ "!";
    }


}

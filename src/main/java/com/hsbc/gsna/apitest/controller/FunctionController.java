package com.hsbc.gsna.apitest.controller;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@Slf4j
@Getter
public class FunctionController {
    private static int[] arr = {3,5,6,7,1,2,4};

    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        log.info("prepare to show array");
        return Arrays.toString(arr);
    }

    @RequestMapping("/sort")
    public String sort() {
        int[] tmp = arr;
        //TODO
        return Arrays.toString(tmp);
    }

    public String deleteMax(){
        int[] tmp = arr;
        //TODO
        return Arrays.toString(tmp);
    }


}

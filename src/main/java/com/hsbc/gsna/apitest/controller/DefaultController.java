package com.hsbc.gsna.apitest.controller;

import com.hsbc.gsna.apitest.entity.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class DefaultController {

    @RequestMapping("/")
    public ModelAndView index() {
        List<Test> testList = new ArrayList<>();
        Method[] methods = FunctionController.class.getDeclaredMethods();
        for (Method method: methods) {
            Test test = new Test();
            test.setBrief(method.getName());
            test.setUrl("/"+method.getName());
            log.debug("API Test: {}", test.getBrief());
            testList.add(test);
        }
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("testList", testList);
        return modelAndView;
    }


}

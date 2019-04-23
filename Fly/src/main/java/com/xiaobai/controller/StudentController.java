package com.xiaobai.controller;

import com.xiaobai.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author 余修文
 * @date 2019/4/23 16:53
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource(name = "StudentService")
    private StudentService studentService;

    @RequestMapping(value = "/getAllstudent", method = RequestMethod.GET)
    public ModelAndView getAllStudent() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentDisplay");
        modelAndView.addObject("students", studentService.getAllStudent());
        return modelAndView;
    }

}

package jit.dyy.edusystem.controller;


import jit.dyy.edusystem.service.admin.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class testController {

    @Autowired
    private CourseTypeService courseTypeService;

//    @RequestMapping("/focus")
//    public String sayHello(){
//        return "before/focus";
//    }


}

package jit.dyy.edusystem.controller.before;

import jit.dyy.edusystem.bean.Course;
import jit.dyy.edusystem.bean.CourseType;
import jit.dyy.edusystem.service.before.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserCourseService courseService;



    @RequestMapping("/index")
    public String index(Model model){
        List<CourseType> courseTypeList = courseService.getAllCourseType();
        model.addAttribute("courseTypeList",courseTypeList);
        return "before/index";
    }

    //显示课程界面
    @RequestMapping("/user/course")
    public String showCourse(Model model){
        List<Course> courseList = courseService.getAllCourses();

        model.addAttribute("courseList",courseList);
        model.addAttribute("msg","全部视频");


        return "before/course";
    }



}

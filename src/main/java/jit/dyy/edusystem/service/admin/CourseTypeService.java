package jit.dyy.edusystem.service.admin;

import jit.dyy.edusystem.bean.CourseType;
import org.springframework.ui.Model;

public interface CourseTypeService {

    public int addCourseType(CourseType courseType);

    public boolean ifExistCourseType(String coursetype_name);

    public String addCourseType(CourseType courseType, Model model);

    public String getCourseTypeData();

    public int delCourseType(int coursetype_id);

}

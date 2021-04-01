package jit.dyy.edusystem.service.admin;

import jit.dyy.edusystem.bean.Course;
import jit.dyy.edusystem.bean.CourseType;

import java.util.List;

public interface CourseService {
    public List<CourseType> selectCourseType();
    public int addCourse(Course course);

    public String showCourse();
    public int updateCourse(Course course);
    public int delCourse(int course_id);
}

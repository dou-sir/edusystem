package jit.dyy.edusystem.service.before;

import jit.dyy.edusystem.bean.Course;
import jit.dyy.edusystem.bean.CourseType;

import java.util.List;

public interface UserCourseService {

    public List<Course> getAllCourses();

    public Course selCourse(int course_id);

    public List<Course> getOtherCourse(int course_id);

    public List<CourseType> getAllCourseType();

    public List<Course> getAllCourseByType(int coursetype_id);
}
package jit.dyy.edusystem.repository.before;

import jit.dyy.edusystem.bean.Course;
import jit.dyy.edusystem.bean.CourseType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserCourseRepository {
    /**
     * 获取所有Course
     * @return
     */
    public List<Course> getAllCourses();

    /**
     * 根据课程ID 查找课程信息
     */
    public Course selCourse(int course_id);

    /**
     * 根据课程ID 查找除此之外的课程 并显示在相关列表中
     */
    public List<Course> selOtherCourse(int course_id);

    /**
     * 根据课程ID 查找除此之外的课程 并显示在相关列表中
     */
    public List<CourseType>  getAllCourseType();


    /**
     * 通过类型ID 查找所有该类型课程
     * @param coursetype_id
     * @return
     */
    public List<Course> getAllCourseByType(int coursetype_id);
}

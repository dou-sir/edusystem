package jit.dyy.edusystem.serviceImpl.before;

import jit.dyy.edusystem.bean.Course;
import jit.dyy.edusystem.bean.CourseType;
import jit.dyy.edusystem.repository.before.UserCourseRepository;
import jit.dyy.edusystem.service.before.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    @Autowired
    private UserCourseRepository userCourseRepository;

    @Override
    public List<Course> getAllCourses() {
        return userCourseRepository.getAllCourses();
    }

    @Override
    public Course selCourse(int course_id) {
        return userCourseRepository.selCourse(course_id);
    }

    @Override
    public List<Course> getOtherCourse(int course_id) {
        List<Course> courseList = userCourseRepository.selOtherCourse(course_id);
        Collections.shuffle(courseList);
        if (courseList.size()<=4){
            return courseList;
        }else {
             return courseList.subList(0,3);
        }



    }

    @Override
    public List<CourseType> getAllCourseType() {
        return userCourseRepository.getAllCourseType();
    }

    @Override
    public List<Course> getAllCourseByType(int coursetype_id) {
        return userCourseRepository.getAllCourseByType(coursetype_id);
    }


}

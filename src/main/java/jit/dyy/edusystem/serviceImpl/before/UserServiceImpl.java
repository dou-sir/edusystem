package jit.dyy.edusystem.serviceImpl.before;

import jit.dyy.edusystem.bean.CourseType;
import jit.dyy.edusystem.bean.User;
import jit.dyy.edusystem.repository.before.UserCourseRepository;
import jit.dyy.edusystem.repository.before.UserRepository;
import jit.dyy.edusystem.service.before.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCourseRepository userCourseRepository;


    @Override
    public int register(User user) {

        return userRepository.register(user);
    }

    @Override
    public boolean ifExistUser(String user_email) {
        if(userRepository.getUserByEmail(user_email) == null){
            return true;
        }
        return false;
    }

    @Override
    public String login(User user, Model model, HttpSession session) {
        User ruser = null;
        List<User> list = userRepository.login(user);
        List<CourseType> courseTypeList  = userCourseRepository.getAllCourseType();

        if (list.size() > 0) {
            ruser = list.get(0);
        }
        if (ruser != null) {
            session.setAttribute("user", ruser);
            session.setAttribute("courseTypeList",courseTypeList);
            model.addAttribute("courseTypeList",courseTypeList);
            return "/before/index";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "/before/login";
        }
    }
}

package jit.dyy.edusystem.service.before;

import jit.dyy.edusystem.bean.Course;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserFocusService {
    public List<Course> getAllFocusByUserId(int user_id);

    public String focus(Model model, Integer id, HttpSession session);

    public String cancelFocus(HttpSession session, Model model, Integer goods_id);
}

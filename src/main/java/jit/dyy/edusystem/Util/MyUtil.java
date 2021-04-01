package jit.dyy.edusystem.Util;

import jit.dyy.edusystem.bean.User;

import javax.servlet.http.HttpSession;

public class MyUtil {

    /**
     * 从session中获取用户ID
     *
     * @param session
     * @return
     */
    public static Integer getUserId(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user==null){
            return 0;
        }
        return user.getUser_id();
    }
}

package jit.dyy.edusystem.controller.admin;

import jit.dyy.edusystem.bean.Auser;
import jit.dyy.edusystem.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminService adminService;


    //管理员登陆
    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String tologin(Model model){
        model.addAttribute("msg","");
        model.addAttribute("auser", new Auser("admin",""));

        return "admin/login";
    }

    @RequestMapping("/admin/login")
    public String login(@ModelAttribute(value = "auser") Auser auser, Model model, HttpSession session){
        return adminService.login(auser, model, session);
    }
}

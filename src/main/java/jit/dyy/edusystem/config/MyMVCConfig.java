package jit.dyy.edusystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//扩展springMVC
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("before/index");
//        registry.addViewController("/login.html").setViewName("login");
//        registry.addViewController("/index.html").setViewName("index");
//        registry.addViewController("/modify.html").setViewName("modifyUser");
//        registry.addViewController("/register.html").setViewName("register");
//        registry.addViewController("/space.html").setViewName("space");
//        registry.addViewController("/play.html").setViewName("play");

    }


}

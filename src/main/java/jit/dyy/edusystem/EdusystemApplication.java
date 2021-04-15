package jit.dyy.edusystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages={"jit.dyy.edusystem.repository"})
public class EdusystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EdusystemApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EdusystemApplication.class);
    }
}

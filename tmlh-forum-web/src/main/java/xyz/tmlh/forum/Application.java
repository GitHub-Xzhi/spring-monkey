package xyz.tmlh.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import xyz.tmlh.forum.core.CoreApplication;

@Import({CoreApplication.class})
@EnableSwagger2
//@EnableAsync
@SpringBootApplication
public class Application{
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        
        
    }


}

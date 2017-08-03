package bootwildfly;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
           

    @Value("${MY_ENV}")
    private String env;     

    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot running in " + env);
    }
}
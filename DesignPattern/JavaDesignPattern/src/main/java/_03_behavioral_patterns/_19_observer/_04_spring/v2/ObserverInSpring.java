package _03_behavioral_patterns._19_observer._04_spring.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverInSpring {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ObserverInSpring.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}

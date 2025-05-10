package fr.insa.opticv.opticvback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class OptiCvBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptiCvBackApplication.class, args);
    }

}

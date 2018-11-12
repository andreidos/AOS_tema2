package web.unitbv.lab.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab3Application {

        @RequestMapping("/{name}")
        public String home(@PathVariable String name) {
                return "Hello " + name;
        }


        public static void main(String[] args) {
                SpringApplication.run(Lab3Application.class, args);
        }

		
}
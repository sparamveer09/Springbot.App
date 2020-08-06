package com.paramveersingh.springbot;

import com.paramveersingh.springbot.dto.User;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@SpringBootApplication
@RestController
public class SpringbotApplication {

    @Getter(lazy = true)
    private static final String TEQUILA = getTequilaText();

    private static String getTequilaText() {
        System.out.println("SpringbotApplication.getTequilaText");
        return "TEQUILA IS BAD FOR HEALTH: DON'T CONSUME";
    }

    @GetMapping(value = "/hello-world")
    @ResponseBody
    public User getHello() {
        User user = new User();
        user.setId(1);
        user.setName("Paramveer");
        user.setCreatedTime(new Date().toString());

        System.out.println("TEQUILA = " + getTEQUILA());
        return user;
    }

    @PostMapping(value = "/put-world")
    @ResponseBody
    public User getHello(@RequestBody User inUser) {
        System.out.println("################ " + inUser.getName() + " === " + inUser.getId());

        User user = new User();
        user.setId(3);
        user.setName("Paramveer");
        System.out.println("TEQUILA = " + getTEQUILA());
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbotApplication.class, args);
    }

}

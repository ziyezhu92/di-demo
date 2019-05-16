package ziye.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ziye.springframework.didemo.services.GreetingService;
import ziye.springframework.didemo.services.GreetingServicelmpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServicelmpl;

    public String sayHello(){
        return greetingServicelmpl.sayGreeting();
    }

}

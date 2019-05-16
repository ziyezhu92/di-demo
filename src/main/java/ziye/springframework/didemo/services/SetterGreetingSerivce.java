package ziye.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingSerivce implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hello - I was in Setter Greeting Service!";
    }
}

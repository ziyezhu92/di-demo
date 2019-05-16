package ziye.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicelmpl implements GreetingService {
    public static final String HELLO_MESSAGE = "Greetings from Hunter";

    @Override
    public String sayGreeting(){
        return HELLO_MESSAGE;
    }
}

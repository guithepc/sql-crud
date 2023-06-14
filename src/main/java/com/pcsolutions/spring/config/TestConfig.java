package com.pcsolutions.spring.config;

import com.pcsolutions.spring.entities.Order;
import com.pcsolutions.spring.entities.User;
import com.pcsolutions.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.*;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    private List<Order> orderList = new ArrayList<>();


    @Override
    public void run(String... args) throws Exception {
        orderList.add(new Order());


        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", orderList);

        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", orderList);

        userRepository.saveAll(Arrays.asList(u1,u2));

    }
}


package com.pcsolutions.spring.resources;

import com.pcsolutions.spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l, "Gui", "gui@gmail.com", "9999999999", "1234%%");
        return ResponseEntity.ok().body(u);
    }
}

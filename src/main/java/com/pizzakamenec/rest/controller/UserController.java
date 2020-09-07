package com.pizzakamenec.rest.controller;

import com.pizzakamenec.model.User;
import com.pizzakamenec.repository.api.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepo;


    @GetMapping("/")
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") String id) {
        user.setId(id);
        return userRepo.update(user);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        userRepo.delete(id);
    }


}

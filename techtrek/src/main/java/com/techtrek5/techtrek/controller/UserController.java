package com.techtrek5.techtrek.controller;

import com.techtrek5.techtrek.model.UserModel;
import com.techtrek5.techtrek.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/usercontroller")
public class UserController {
    private UserService userService;
    private UserModel userModel;

    @GetMapping(path = "/health")
    public String healthcheck(){//test for controller response
        return "hello";
    }

    @PostMapping(path = "/findid/{id}")
    public Optional<UserModel> healthcheck(@PathVariable("id") long id){//test for controller response
        return userService.findByid(id);
    }

    @PostMapping(path = "/save")
    public String save(@RequestBody UserModel userModel){//test for controller response
        return userService.save(userModel);
    }
}

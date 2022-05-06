package com.techtrek5.techtrek.service;

import com.techtrek5.techtrek.model.UserModel;

import java.util.Optional;

public interface IService {
    public Optional<UserModel> findByid(long id);
    public String findByusername(String username);
    public String findByname(String name);
    public String findByappointment(String appointment);
    String save(UserModel userModel);
}

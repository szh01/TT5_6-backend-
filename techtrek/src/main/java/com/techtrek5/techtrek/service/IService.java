package com.techtrek5.techtrek.service;

import com.techtrek5.techtrek.model.UserModel;

import java.util.Optional;

public interface IService {
    Optional<UserModel> findByid(long id);
    Optional<UserModel> findByusername(String username);
    Optional<UserModel> findByname(String name);
    Optional<UserModel> findByappointment(String appointment);
    String save(UserModel userModel);
}

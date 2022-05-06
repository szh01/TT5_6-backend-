package com.techtrek5.techtrek.dao;

import com.techtrek5.techtrek.model.UserModel;

import java.util.Optional;

public interface IDao {
    Optional<UserModel> findByid(long id);
    String findByusername(String username);
    String findByname(String name);
    String findByappointment(String appointment);
    UserModel save(UserModel userModel);
}

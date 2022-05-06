package com.techtrek5.techtrek.dao;

import com.techtrek5.techtrek.model.UserModel;

import java.util.Optional;

public interface IDao {
    Optional<UserModel> findByid(long id);
    Optional<UserModel> findByusername(String username);
    Optional<UserModel> findByname(String name);
    Optional<UserModel> findByappointment(String appointment);
    UserModel save(UserModel userModel);
}

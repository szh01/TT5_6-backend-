package com.techtrek5.techtrek.UserPackage.dao;

import com.techtrek5.techtrek.UserPackage.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface IDao {
    Optional<UserModel> findByid(long id);
    Optional<List<UserModel>> findByusername(String username);
    Optional<List<UserModel>> findByname(String name);
    Optional<List<UserModel>> findByappointment(String appointment);
    UserModel save(UserModel userModel);
}

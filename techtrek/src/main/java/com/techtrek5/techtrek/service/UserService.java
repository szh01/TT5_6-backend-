package com.techtrek5.techtrek.service;

import com.techtrek5.techtrek.dao.IDao;
import com.techtrek5.techtrek.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IService{
    private IDao iDao;
    private UserModel userModel;

    @Override
    public Optional<UserModel> findByusername(String username) {
        return iDao.findByusername(username);
    }

    @Override
    public Optional<UserModel> findByname(String name) {
        return iDao.findByname(name);
    }

    @Override
    public Optional<UserModel> findByappointment(String appointment) {
        return iDao.findByappointment(appointment);
    }

    @Override
    public Optional<UserModel> findByid(long id) {
        return iDao.findByid(id);
    }

    @Override
    public String save(UserModel userModel) {
        iDao.save(userModel);
        return "successfully saved";
    }
}

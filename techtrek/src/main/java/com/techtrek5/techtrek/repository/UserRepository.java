package com.techtrek5.techtrek.repository;

import com.techtrek5.techtrek.dao.IDao;
import com.techtrek5.techtrek.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends IDao, JpaRepository<UserModel, Long> {
    Optional<UserModel> findByid(long id);
    Optional<UserModel> findByusername(String username);
    Optional<UserModel> findByname(String name);
    Optional<UserModel> findByappointment(String appointment);

}

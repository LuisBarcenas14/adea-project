package com.example.adeaproject.dao;

import com.example.adeaproject.models.User;

import java.util.List;


public interface UserDAO {

    public List<User> findAll();

    public User findById(int id);

    public void save(User user);

    public void deleteById(int id);
}
package ru.jalolov.webCRUD.dao;

import ru.jalolov.webCRUD.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(int id);
    void save(User user) throws Exception;
    void update(User user);
    void delete(int id);
    User findByName(String name);
}

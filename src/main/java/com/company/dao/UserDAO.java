package com.company.dao;

import com.company.database.DataBase;
import com.company.entity.User;

import java.util.List;
import java.util.Optional;

public class UserDAO implements DAO<User> {
    private DataBase dataBase = DataBase.getInstance();

    @Override
    public List<User> getAll() {
        return dataBase.getUsers();
    }

    @Override
    public Optional<User> getId(int id) {
        return Optional.ofNullable(dataBase.getUsers().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getUsers().removeIf(x -> x.getId() == id);
    }

    @Override
    public boolean creat(User user) {
        if (user == null)
            return false;
        if (dataBase.getUsers().equals(user))
            return false;
        dataBase.getUsers().add(user);
        return true;
    }
}

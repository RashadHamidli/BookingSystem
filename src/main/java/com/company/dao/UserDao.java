package com.company.dao;

import com.company.database.DataBase;
import com.company.entity.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User> {
    private DataBase dataBase = DataBase.getInstance();

    @Override
    public List getAll() {
        return dataBase.getUsers();
    }

    @Override
    public Optional get(int id) {
        return Optional.ofNullable(dataBase.getUsers().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getUsers().removeIf(user -> user.getId() == id);
    }

    @Override
    public boolean create(User user) {
        if (user == null)
            return false;
        if (dataBase.getUsers().contains(user))
            return false;
        dataBase.getUsers().add(user);
        return true;
    }


}

package com.company.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    List<T> getAll();

    Optional<T> getId(int id);

    boolean delete(int id);

    boolean creat(T t);

}

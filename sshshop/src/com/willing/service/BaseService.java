package com.willing.service;

import java.util.List;

/**
 * Created by willingLin on 2016/9/25.
 */
public interface BaseService<T> {

    void update(T t);

    void save(T t);

    void delete(int id);

    T getById(int id);

    List<T> queryAll();

}

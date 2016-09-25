package com.willing.service.impl;

import com.willing.model.Category;
import com.willing.service.BaseService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by willingLin on 2016/9/25.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private Class clazz;

    private SessionFactory sessionFactory;

    public BaseServiceImpl() {
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        clazz = (Class)type.getActualTypeArguments()[0];
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void update(T t) {
        getSession().update(t);
    }

    @Override
    public void save(T t) {
        getSession().save(t);
    }

    @Override
    public void delete(int id) {
        String hql = "DELETE " + clazz.getSimpleName() + " WHERE id = :id";
        getSession().createQuery(hql).setInteger("id", id).executeUpdate();
    }

    @Override
    public T getById(int id) {
        return (T) getSession().get(clazz, id);
    }

    @Override
    public List<T> queryAll() {
        String hql = "FROM " + clazz.getSimpleName();
        return getSession().createQuery(hql).list();
    }
}

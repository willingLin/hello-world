package com.willing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.willing.service.AccountService;
import com.willing.service.CategoryService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

/**
 * Created by willingLin on 2016/10/7.
 */
public class BaseAction<T> extends ActionSupport implements RequestAware, SessionAware, ApplicationAware, ModelDriven<T> {

    protected Map<String, Object> request;
    protected Map<String, Object> session;
    protected Map<String, Object> application;
    protected T model;

    private CategoryService categoryService;

    protected AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    public T getModel() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class clazz = (Class)type.getActualTypeArguments()[0];
        try {
            model = (T)clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return model;
    }

    @Override
    public void setApplication(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setRequest(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setSession(Map<String, Object> application) {
        this.application = application;
    }
}

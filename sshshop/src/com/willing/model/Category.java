package com.willing.model;

/**
 * Created by willingLin on 2016/8/24.
 */
public class Category {
    private Integer id;
    private String type;
    private Boolean hot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Category() {
    }

    public Category(String type, Boolean hot) {
        this.type = type;
        this.hot = hot;
    }

    public Category(Integer id, String type, Boolean hot) {
        this.id = id;
        this.type = type;
        this.hot = hot;
    }
}

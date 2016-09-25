package com.willing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.willing.model.Category;
import com.willing.service.CategoryService;

/**
 * Created by willingLin on 2016/9/6.
 */
public class CategoryAction extends ActionSupport {

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private CategoryService categoryService;

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public String update() {
        System.out.println("=============================");
        categoryService.update(category);
        return "index";
    }

}

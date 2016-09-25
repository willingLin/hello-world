package com.willing.test;

import com.willing.model.Category;
import com.willing.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by willingLin on 2016/8/24.
 * 使用spring的注解进行测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-*.xml")
public class SSHtest {

    @Resource
    private CategoryService categoryService;

    @Test
    public void testUpdate() {
        categoryService.delete(3);

    }


}

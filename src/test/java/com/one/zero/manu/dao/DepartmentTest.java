package com.one.zero.manu.dao;

import com.one.zero.manu.bean.Department;
import com.one.zero.manu.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MyBatis - test
 * 配置数据库连接设置 && MyBatis 配置 + InterfaceMapper && Mapper.xml
 * Created by MANU on 2018/7/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testInsert() {
        Department department = new Department();
        department.setId(1);
        department.setName("研发部");
        department.setDescr("开发产品");
        this.departmentMapper.insert(department);
    }

    @Test
    public void testGetById() {
        Department department = this.departmentMapper.getById(1);
        System.out.println(department);
    }

    @Test
    public void testUpdate() {
        Department department = new Department();
        department.setId(1);
        department.setDescr("开发高级产品");
        this.departmentMapper.update(department);
    }

    @Test
    public void testDeleteById() {
        this.departmentMapper.deleteById(1);
    }
}

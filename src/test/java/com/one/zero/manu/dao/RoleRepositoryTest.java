package com.one.zero.manu.dao;

import com.one.zero.manu.bean.Role;
import com.one.zero.manu.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * JPA - test
 * 配置数据库连接设置 && JPA 配置 + Interface 声明即可
 * Created by MANU on 2018/7/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testInsert() {
        Role role = new Role();
        role.setName("管理员");
        role.setDescr("测试");
        Role result = this.roleRepository.save(role);
        System.out.println(result);
    }

    @Test
    public void testFindOne() {
        Optional<Role> role = this.roleRepository.findById(1);
        System.out.println(role);
    }

    @Test
    public void testUpdate() {
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        role.setDescr("控制权限");
        Role result = this.roleRepository.save(role);
        System.out.println(result);
    }

    /**
     * 数据库没有 id = 1 的数据会报错
     */
    @Test
    public void testDelete() {
        this.roleRepository.deleteById(1);
    }
}
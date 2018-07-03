package com.one.zero.manu.dao;

import com.one.zero.manu.bean.User;

/**
 * Created by MANU on 2018/7/2.
 */
public interface UserDao {

    public int insert(User user);

    public int deleteById(Integer id);

    public int update(User user);

    public User getById(Integer id);
}

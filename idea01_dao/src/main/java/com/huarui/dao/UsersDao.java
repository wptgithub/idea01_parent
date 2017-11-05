package com.huarui.dao;

import com.huarui.entity.Users;

import java.util.List;

/**
 * Created by DELL on 2017.11.04.
 */
public interface UsersDao {
    List<Users> findAll();
}

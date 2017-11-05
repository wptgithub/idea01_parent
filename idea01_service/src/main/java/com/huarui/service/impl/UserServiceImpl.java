package com.huarui.service.impl;

import com.huarui.dao.UsersDao;
import com.huarui.dao.impl.UsersDaoImpl;
import com.huarui.entity.Users;
import com.huarui.service.UserService;

import java.util.List;

/**
 * Created by DELL on 2017.11.04.
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<Users> findAll() {
        UsersDao dao=new UsersDaoImpl();
        return dao.findAll();
    }
}

package com.huarui.Action;

import com.huarui.entity.Users;
import com.huarui.service.UserService;
import com.huarui.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 2017.11.04.
 */
@Controller
public class UserAction {
    @RequestMapping("test")
    @ResponseBody
    public List<Users> fidAll(){
        UserService service=new UserServiceImpl();
        return service.findAll();
    }
}

package com.mtc.base.web;

import com.google.gson.Gson;
import com.mtc.base.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 10/13/16.
 */
@Controller
public class BaseController {

    @ResponseBody
    @RequestMapping(value = "/api/index.htm",method = RequestMethod.GET)
    public String test(){
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/api/user.htm",method = RequestMethod.GET)
    public String getUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User(1L,"majun1","male",18L,"China"));
        list.add(new User(2L,"majun2","male",18L,"China"));
        list.add(new User(3L,"majun3","male",18L,"China"));
        list.add(new User(4L,"majun4","male",18L,"China"));

        Gson gson = new Gson();
        String str = gson.toJson(list);

        return str;
    }

}

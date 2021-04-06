package com.neusoft.icelake.modules.demo.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import com.neusoft.icelake.modules.demo.entity.User;
import com.neusoft.icelake.modules.demo.entity.Users;
import com.neusoft.icelake.modules.demo.service.IUserService;

@Named("UserService")
public class UserServiceImpl implements IUserService {

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("liyiming");
        return user;
    }

    @Override
    public Users getArray() {
        User[] array = new User[5];
        User user = null;
        for (int i = 0; i < array.length; i++) {
            user = new User();
            user.setId(i);
            user.setName("arrayName-" + i);
            array[i] = user;
        }
        Users users = new Users();
        users.setUserArr(array);
        return users;
    }

    @Override
    public Users getList() {
        List<User> list = new ArrayList<User>();
        User user = null;
        for (int i = 0; i < 4; i++) {
            user = new User();
            user.setId(i);
            user.setName("ListName-第" + i + "个");
            list.add(user);
        }
        Users users = new Users();
        users.setUsers(list);
        return users;
    }

    @Override
    public Users getMap() {
        Map<String, User> map = new HashMap<String, User>();
        User user = null;
        for (int i = 0; i < 4; i++) {
            user = new User();
            user.setId(i);
            user.setName("mapName" + i);
            map.put("key-" + i, user);
        }
        Users users = new Users();
        users.setMap(map);
        return users;
    }

    /*
    *    return null; 相当于python中的pass
     */
    @Override
    public User postData(User user) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User putData(int id, User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteData(int id) {
        // TODO Auto-generated method stub
    }

}
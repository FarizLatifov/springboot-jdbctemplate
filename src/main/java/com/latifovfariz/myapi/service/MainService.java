package com.latifovfariz.myapi.service;


import com.latifovfariz.myapi.dao.LotteryDao;
import com.latifovfariz.myapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MainService {

    private List<User> userList = new ArrayList(Arrays.asList(
            new User(1, "fariz", "fariz@mail.org"),
            new User(1, "fariz", "fariz@mail.org"),
            new User(1, "fariz", "fariz@mail.org")
    ));

    @Autowired
    private LotteryDao lotteryDao;


    public List<User> getStaticUserList(){
        return this.userList;
    }

    public List<User> getUserList(){
        return lotteryDao.findAll();
    }

}

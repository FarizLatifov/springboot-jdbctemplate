package com.latifovfariz.myapi.controller;

import com.latifovfariz.myapi.model.User;
import com.latifovfariz.myapi.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
  public class MainController {


    @Autowired
    private MainService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return service.getUserList();
    }



}

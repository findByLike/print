package com.supply.print.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supply.print.mapper.UsersMapper;
import com.supply.print.model.Users;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UsersMapper usersMapper;
	
    @RequestMapping("/hello")
    public String index() {
    	Users one = usersMapper.getOne(1);
        return one.getAccount();
    }
}
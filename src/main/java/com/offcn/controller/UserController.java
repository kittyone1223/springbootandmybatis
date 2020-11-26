package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public String add(@RequestBody User user){
        try {
            userService.add(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        try {
            userService.delete(id);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除失败";
        }
    }


    @PutMapping("/{id}")
    public String update(@PathVariable("id")Long id,@RequestBody User user){
        try {
            userService.update(user,id);
            return "更新成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "更新失败";
        }
    }


    @GetMapping("/")
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Long id){
        try {
            User one = userService.findOne(id);
            return one;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

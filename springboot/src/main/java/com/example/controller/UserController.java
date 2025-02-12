package com.example.controller;

import com.example.common.Result;
import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
/**
 * 用户前端操作接口
 **/
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

<<<<<<< HEAD
    /**
     * 新增
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        userService.add(user);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        userService.update(user);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return Result.success();
    }

    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        userService.deleteBatch(ids);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 分页查询
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectPage")
    public Result selectPage(User user,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<User> page = userService.selectPage(user, pageNum, pageSize);
        return Result.success(page);
    }
}

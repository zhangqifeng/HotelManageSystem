package com.example.controller;

import com.example.common.Result;
import com.example.entity.Admin;
import com.example.service.AdminService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * 管理员前端操作接口
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

<<<<<<< HEAD
    /**
     * 新增
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @PostMapping("/add")
    public Result add(@RequestBody Admin admin) {
        adminService.add(admin);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 删除
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        adminService.deleteById(id);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 批量删除
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        adminService.deleteBatch(ids);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 修改
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @PutMapping("/update")
    public Result updateById(@RequestBody Admin admin) {
        adminService.updateById(admin);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 根据ID查询
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        Admin admin = adminService.selectById(id);
        return Result.success(admin);
    }

<<<<<<< HEAD
    /**
     * 查询所有
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectAll")
    public Result selectAll(Admin admin ) {
        List<Admin> list = adminService.selectAll(admin);
        return Result.success(list);
    }

<<<<<<< HEAD
    /**
     * 分页查询
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectPage")
    public Result selectPage(Admin admin,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Admin> page = adminService.selectPage(admin, pageNum, pageSize);
        return Result.success(page);
    }

}
package com.example.controller;

import com.example.common.Result;
import com.example.entity.Notice;
import com.example.service.NoticeService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * 公告信息表前端操作接口
 **/
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Resource
    private NoticeService noticeService;

<<<<<<< HEAD
    /**
     * 新增
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @PostMapping("/add")
    public Result add(@RequestBody Notice notice) {
        noticeService.add(notice);
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
        noticeService.deleteById(id);
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
        noticeService.deleteBatch(ids);
        return Result.success();
    }

<<<<<<< HEAD
    /**
     * 修改
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @PutMapping("/update")
    public Result updateById(@RequestBody Notice notice) {
        noticeService.updateById(notice);
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
        Notice notice = noticeService.selectById(id);
        return Result.success(notice);
    }

<<<<<<< HEAD
    /**
     * 查询所有
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectAll")
    public Result selectAll(Notice notice ) {
        List<Notice> list = noticeService.selectAll(notice);
        return Result.success(list);
    }

<<<<<<< HEAD
    /**
     * 分页查询
     */
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @GetMapping("/selectPage")
    public Result selectPage(Notice notice,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Notice> page = noticeService.selectPage(notice, pageNum, pageSize);
        return Result.success(page);
    }

}
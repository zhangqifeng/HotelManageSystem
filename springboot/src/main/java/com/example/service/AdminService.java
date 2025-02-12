package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.Constants;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.entity.Account;
import com.example.entity.Admin;
import com.example.exception.CustomException;
import com.example.mapper.AdminMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
/**
 * 管理员业务处理
 **/
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
@Service
public class AdminService {

    @Resource
    private AdminMapper adminMapper;

<<<<<<< HEAD
    /**
     * 新增
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void add(Admin admin) {
        Admin dbAdmin = adminMapper.selectByUsername(admin.getUsername());
        if (ObjectUtil.isNotNull(dbAdmin)) {
            throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
        }
        if (ObjectUtil.isEmpty(admin.getPassword())) {
            admin.setPassword(Constants.USER_DEFAULT_PASSWORD);
        }
        if (ObjectUtil.isEmpty(admin.getName())) {
            admin.setName(admin.getUsername());
        }
        admin.setRole(RoleEnum.ADMIN.name());
        adminMapper.insert(admin);
    }

<<<<<<< HEAD
    /**
     * 删除
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void deleteById(Integer id) {
        adminMapper.deleteById(id);
    }

<<<<<<< HEAD
    /**
     * 批量删除
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            adminMapper.deleteById(id);
        }
    }

<<<<<<< HEAD
    /**
     * 修改
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void updateById(Admin admin) {
        adminMapper.updateById(admin);
    }

<<<<<<< HEAD
    /**
     * 根据ID查询
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public Admin selectById(Integer id) {
        return adminMapper.selectById(id);
    }

<<<<<<< HEAD
    /**
     * 查询所有
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public List<Admin> selectAll(Admin admin) {
        return adminMapper.selectAll(admin);
    }

<<<<<<< HEAD
    /**
     * 分页查询
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public PageInfo<Admin> selectPage(Admin admin, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Admin> list = adminMapper.selectAll(admin);
        return PageInfo.of(list);
    }

<<<<<<< HEAD
    /**
     * 登录
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public Account login(Account account) {
        Account dbAdmin = adminMapper.selectByUsername(account.getUsername());
        if (ObjectUtil.isNull(dbAdmin)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(dbAdmin.getPassword())) {
            throw new CustomException(ResultCodeEnum.USER_ACCOUNT_ERROR);
        }
        // 生成token
        String tokenData = dbAdmin.getId() + "-" + RoleEnum.ADMIN.name();
        String token = TokenUtils.createToken(tokenData, dbAdmin.getPassword());
        dbAdmin.setToken(token);
        return dbAdmin;
    }

<<<<<<< HEAD
    /**
     * 注册
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void register(Account account) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(account, admin);
        add(admin);
    }

<<<<<<< HEAD
    /**
     * 修改密码
     */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void updatePassword(Account account) {
        Admin dbAdmin = adminMapper.selectByUsername(account.getUsername());
        if (ObjectUtil.isNull(dbAdmin)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(dbAdmin.getPassword())) {
            throw new CustomException(ResultCodeEnum.PARAM_PASSWORD_ERROR);
        }
        dbAdmin.setPassword(account.getNewPassword());
        adminMapper.updateById(dbAdmin);
    }

}
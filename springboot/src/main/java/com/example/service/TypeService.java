package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.entity.Account;
import com.example.entity.Type;
import com.example.exception.CustomException;
import com.example.mapper.TypeMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeService {

    @Resource
    private TypeMapper typeMapper;

    public void add(Type type) {
        Account currentUser = TokenUtils.getCurrentUser();
        if (ObjectUtil.isNull(currentUser)) {
            throw new CustomException(ResultCodeEnum.TOKEN_CHECK_ERROR);
        }
        type.setHotelId(currentUser.getId());
        typeMapper.insert(type);
    }

    public void deleteById(Integer id) {
        typeMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            typeMapper.deleteById(id);
        }
    }

    public void updateById(Type type) {
        typeMapper.updateById(type);
    }

    public Type selectById(Integer id) {
        return typeMapper.selectById(id);
    }

    public List<Type> selectAll(Type type) {
        return typeMapper.selectAll(type);
    }

    public PageInfo<Type> selectPage(Type type, Integer pageNum, Integer pageSize) {
        Account currentUser = TokenUtils.getCurrentUser();
        if (ObjectUtil.isNull(currentUser)) {
            throw new CustomException(ResultCodeEnum.TOKEN_CHECK_ERROR);
        }
        if (RoleEnum.HOTEL.name().equals(currentUser.getRole())) {
            type.setHotelId(currentUser.getId());
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Type> list = typeMapper.selectAll(type);
        return PageInfo.of(list);
    }

    public List<Type> selectByHotelId(Integer hotelId) {
        return typeMapper.selectByHotelId(hotelId);
    }
}

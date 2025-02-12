package com.example.service;

<<<<<<< HEAD
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
import cn.hutool.core.util.ObjectUtil;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.common.enums.StatusEnum;
import com.example.entity.Account;
<<<<<<< HEAD
import com.example.entity.Admin;
import com.example.entity.Hotel;
import com.example.entity.User;
=======
import com.example.entity.Hotel;
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
import com.example.exception.CustomException;
import com.example.mapper.HotelMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
/**
 * 酒店业务处理
 **/
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
@Service
public class HotelService {

    @Resource
    private HotelMapper hotelMapper;

    public void add(Hotel hotel) {
        // 1. 做一下重复性校验
        Hotel hotelUser = hotelMapper.selectByUsername(hotel.getUsername());
        if (ObjectUtil.isNotEmpty(hotelUser)) {
            throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
        }
        if (ObjectUtil.isEmpty(hotel.getPassword())) {
<<<<<<< HEAD
            hotel.setPassword("123456");
=======
            hotel.setPassword("111");
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
        }
        if (ObjectUtil.isEmpty(hotel.getRole())) {
            hotel.setRole(RoleEnum.HOTEL.name());
        }
        if (ObjectUtil.isEmpty(hotel.getAvatar())) {
<<<<<<< HEAD
            hotel.setAvatar("http://localhost:9090/files/1697438073596-avatar.png");
=======
            hotel.setAvatar("http://localhost:9091/files/1697438073596-avatar.png");
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
        }
        hotel.setStatus(StatusEnum.CHECKING.status);
        hotelMapper.insert(hotel);
    }

    public PageInfo<Hotel> selectPage(Hotel hotel, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Hotel> hotels = hotelMapper.selectAll(hotel);
        return PageInfo.of(hotels);
    }

    public void update(Hotel hotel) {
        hotelMapper.updateById(hotel);
    }

    public void deleteById(Integer id) {
        hotelMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> list) {
        for (Integer id : list) {
            deleteById(id);
        }
    }

    public Account login(Account account) {
        Account hotel = hotelMapper.selectByUsername(account.getUsername());
        if (ObjectUtil.isNull(hotel)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(hotel.getPassword())) {
            throw new CustomException(ResultCodeEnum.USER_ACCOUNT_ERROR);
        }
        // 生成token
        String tokenData = hotel.getId() + "-" + RoleEnum.HOTEL.name();
        String token = TokenUtils.createToken(tokenData, hotel.getPassword());
        hotel.setToken(token);
        return hotel;
    }

<<<<<<< HEAD
=======
    public Hotel selectById(Integer id) {
        return hotelMapper.selectById(id);
    }

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void register(Account account) {
        Hotel hotel = new Hotel();
        BeanUtils.copyProperties(account, hotel);
        add(hotel);
    }

<<<<<<< HEAD
    public Hotel selectById(Integer id) {
        return hotelMapper.selectById(id);
    }

=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    public void updatePassword(Account account) {
        Hotel dbHotel = hotelMapper.selectByUsername(account.getUsername());
        if (ObjectUtil.isNull(dbHotel)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(dbHotel.getPassword())) {
            throw new CustomException(ResultCodeEnum.PARAM_PASSWORD_ERROR);
        }
        dbHotel.setPassword(account.getNewPassword());
        hotelMapper.updateById(dbHotel);
    }
<<<<<<< HEAD
=======

    public List<Hotel> selectAll() {
        return hotelMapper.selectAll(new Hotel());
    }
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
}

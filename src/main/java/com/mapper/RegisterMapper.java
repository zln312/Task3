package com.mapper;

import com.entity.Register;

public interface RegisterMapper {
    int insert(Register record);

    int insertSelective(Register record);
}
package com.mapper;

import com.entity.Banner;

import java.util.List;

public interface BannerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Banner record);

    int insertSelective(Banner record);

    List selectByPrimaryKey(Long id);

    List selectByStatus(Boolean status);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}
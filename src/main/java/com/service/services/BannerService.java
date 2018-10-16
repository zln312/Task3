package com.service.services;

import com.entity.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BannerService {
    int deleteByPrimaryKey(Long id);

    int insert(Banner record);

    int insertSelective(Banner record);

    List selectByPrimaryKey(Long id);

    List selectByStatus(Boolean status);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}

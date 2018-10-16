package com.service.services;

import com.entity.Art;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArtService {
    int deleteByPrimaryKey(Long id);

    int insert(Art record);

    int insertSelective(Art record);

    List<Art> selectByPrimaryKey(@Param("status") int status, @Param("type") int type);

    int updateByPrimaryKeySelective(Art record);

    int updateByPrimaryKey(Art record);
}

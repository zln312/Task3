package com.service.services;

import com.entity.Words;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordsService {
    int deleteByPrimaryKey(Long id);

    int insert(Words record);

    int insertSelective(Words record);

    List selectByWorksId(Long WorksId);

    int updateByPrimaryKeySelective(Words record);

    int updateByPrimaryKey(Words record);
}

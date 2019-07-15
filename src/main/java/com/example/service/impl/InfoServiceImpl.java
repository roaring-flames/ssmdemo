package com.example.service.impl;

import com.example.DTO.InfoDTO;
import com.example.entity.Info;
import com.example.mapper.InfoMapper;
import com.example.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;


    /**
     * 添加一条信息
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Info record) {
        return infoMapper.insert(record);
    }

    @Override
    public int delete(Integer id) {
        return infoMapper.delete(id);
    }

    @Override
    public int deleteAll(List<InfoDTO> list) {
        return infoMapper.deleteAll(list);
    }


   /* @Override
    public int insertSelective(Info record) {
        return infoMapper.insertSelective(record);
    }*/

    @Override
    public List<Info> selectAll() {
        return infoMapper.selectAll();
    }

    @Override
    public List<Info> selectAlls(Info info) {
        return infoMapper.selectAlls(info);
    }
}

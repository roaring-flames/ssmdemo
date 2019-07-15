package com.example.service;

import com.example.DTO.InfoDTO;
import com.example.entity.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoService {

    /**
     * 批量更新
     * @param list
     * @return
     */
//    int updateAll(List<Info>list);

    /**
     * 更新一条信息
     *
     * @param info
     * @return
     */
   // int updateByPrimaryKey(List<Info> info);

    /**
     * 更新一条信息
     *
     * @param info
     * @return
     */
    int updateAll(List<Info> info);


    /**
     * 添加一条信息
     *
     * @param record
     * @return
     */
    int insert(Info record);

    /**
     * 动态插入一条数据
     * @param record
     * @return
     */
    /* int insertSelective(Info record);*/

    /**
     * 删除单条记录
     *
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 批量删除单条记录
     *
     * @param list
     * @return
     */
    int deleteAll(List<InfoDTO> list);

    /**
     * 批量删除
     * @return
     */
//    int deleteAll();


    /**
     * 查询所有
     *
     * @return
     */
    List<Info> selectAll();

    /**
     * 动态查询
     *
     * @param info
     * @return
     */
    List<Info> selectAlls(Info info);
}

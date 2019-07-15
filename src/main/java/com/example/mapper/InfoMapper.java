package com.example.mapper;

import com.example.DTO.InfoDTO;
import com.example.entity.Info;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InfoMapper {
    /*  int deleteByPrimaryKey(Integer id);


      Info selectByPrimaryKey(Integer id);

      int updateByPrimaryKeySelective(Info record);

      int updateByPrimaryKey(Info record);*/

    //int updateAll(@Param("list")List<Info>list);

    /**
     * 更新一条信息
     * @param info
     * @return
     */
    int updateByPrimaryKey(@Param("list") List<Info> info);

    /**
     * 删除单条信息
     * @param id
     * @return
     */
    int delete(@Param("id") Integer id);

    /**
     * 批量删除
     * @param list
     * @return
     */
    int deleteAll(@Param("list") List<InfoDTO> list);


    /**
     * 添加一条信息
     *
     * @param record
     * @return
     */
    int insert(Info record);

    /**
     * 查询所有信息
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
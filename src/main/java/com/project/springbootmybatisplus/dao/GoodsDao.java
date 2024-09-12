package com.project.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.springbootmybatisplus.model.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao  extends BaseMapper<Goods> {


    List<Goods> findByName(String name);
}

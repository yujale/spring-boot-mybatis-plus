package com.project.springbootmybatisplus.service.impl;

import com.project.springbootmybatisplus.dao.GoodsDao;
import com.project.springbootmybatisplus.model.Goods;
import com.project.springbootmybatisplus.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsDao, Goods> implements IGoodsService {
}

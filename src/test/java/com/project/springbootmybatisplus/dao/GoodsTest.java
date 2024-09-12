package com.project.springbootmybatisplus.dao;

import com.project.springbootmybatisplus.model.Goods;
import com.project.springbootmybatisplus.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;


import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class GoodsTest {

    @Resource
    private GoodsDao goodsDao;

    @Test
    public void queryByName() {
        List<Goods> list = goodsDao.findByName("Redmi");
        log.info(JsonUtils.prettyPrint(list));

    }

    @Test
    public void selectList() {
        List<Goods> list = goodsDao.selectList(
                new LambdaQueryWrapper<Goods>()
                        .like(Goods::getName, "Redmi")
        );
        log.info(JsonUtils.prettyPrint(list));
    }
}

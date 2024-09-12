package com.project.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.project.springbootmybatisplus.SpringBootMybatisPlusApplicationTests;
import com.project.springbootmybatisplus.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Component
public class GoodsServiceTest extends SpringBootMybatisPlusApplicationTests {

    @Resource
    private IGoodsService goodsService;
    @Test
    public void initData() {
        Goods goods = new Goods()
                .setName("Redmi K50")
                .setPrice(new BigDecimal("2599"))
                ;
        goods.setEnabledState(true);
        boolean result = goodsService.save(goods);
        Assert.isTrue(result, "商户数据添加失败");
    }

    @Test
    public void page() {
        Page<?> pageRequest = Page.of(1, 1);
        IPage<Goods> page = goodsService.page(
                new Page<>(1, 1),
                null
        );
        log.info("goods page: [{}]", page);
    }

    @Test
    public void list() {
        List<Goods> list = goodsService.list();
        log.info("goods list: [{}]", list);
    }

}

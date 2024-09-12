package com.project.springbootmybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.project.springbootmybatisplus.base.BaseBizEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@TableName("test_goods")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Goods extends BaseBizEntity {
    private String name;
    private String description;
    private BigDecimal price;

}

package com.project.springbootmybatisplus.base;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 业务基础实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BaseBizEntity extends BaseEntity {

    private static final long serialVersionUID = 1464845551976822009L;

    /**
     * 启用状态
     */
    private Boolean enabledState;

    /**
     * 删除状态
     */
    @TableLogic
    private Boolean deletedState;

}

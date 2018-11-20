package com.lc.springcloud.configclient.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author LC
 * @date 2018/11/20
 */
@Data
@TableName("tb_user")
public class UserEntity {

    @TableId
    private String id;

    private String name;

}
 
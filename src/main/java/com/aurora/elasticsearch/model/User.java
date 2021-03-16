package com.aurora.elasticsearch.model;

import lombok.Data;

/**
 * @author 褚佳鑫
 * @description 用户
 * @date 2021/3/16 14:42
 **/

@Data
public class User {
    private Long userId;
    private String userName;
    private Integer userAge;
}

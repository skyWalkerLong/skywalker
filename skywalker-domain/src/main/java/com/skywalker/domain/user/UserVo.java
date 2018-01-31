package com.skywalker.domain.user;

import lombok.Data;

/**
 * @Author longchao
 * @Date 2018/1/12.
 */

@Data
public class UserVo extends User{
    private Integer id;

    private String user_name;

    private String user_like;

}

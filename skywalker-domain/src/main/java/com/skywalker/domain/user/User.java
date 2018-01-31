package com.skywalker.domain.user;


import lombok.Data;

import java.io.Serializable;

/**
 * @Author longchao
 * @Date 2018/1/12.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -4342263227317379300L;

    private Integer id;
    private String uid;
    private String loginname;
    private String loginpass;
    private String email;
    private boolean status;

}

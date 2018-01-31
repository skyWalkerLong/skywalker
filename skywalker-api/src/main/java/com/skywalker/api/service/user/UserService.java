package com.skywalker.api.service.user;

import com.skywalker.domain.user.User;
import com.skywalker.domain.user.UserLike;
import com.skywalker.domain.user.UserVo;

import java.util.List;

/**
 * @Author longchao
 * @Date 2018/1/15.
 */
public interface UserService {
    void addUser(User user) throws Exception;

    List<UserVo> getAllUser();

    void addUserlike(UserLike userLike);
}

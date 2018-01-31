package com.skywalker.provider.mapper.user;

import com.skywalker.domain.user.User;
import com.skywalker.domain.user.UserLike;
import com.skywalker.domain.user.UserVo;

import java.util.List;

/**
 * @Author longchao
 * @Date 2018/1/15.
 */
public interface UserMapper {
    void addUser(User user) throws Exception;

    List<UserVo> selectAllUser();

    void addUserlike(UserLike userLike);
}

package com.skywalker.provider.service.user;

import com.skywalker.api.service.user.UserService;
import com.skywalker.domain.user.User;
import com.skywalker.domain.user.UserLike;
import com.skywalker.domain.user.UserVo;
import com.skywalker.provider.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @Author longchao
 * @Date 2018/1/15.
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) throws Exception {
        user.setUid(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println("uuid="+UUID.randomUUID().toString().replaceAll("-", ""));
        user.setStatus(false);
        System.out.println("进入service!");
        userMapper.addUser(user);
    }

    public List<UserVo> getAllUser() {

        return userMapper.selectAllUser();
    }

    @Override
    public void addUserlike(UserLike userLike){
        userMapper.addUserlike(userLike);
    }
}

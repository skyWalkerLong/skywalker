package com.skywalker.consumer.controller;

import com.skywalker.api.service.user.UserService;
import com.skywalker.domain.user.User;
import com.skywalker.domain.user.UserLike;
import com.skywalker.domain.user.UserVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin.javascript.navig.JSObjectFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author longchao
 * @Date 2018/1/12.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    //属性名和前端name一一对应，如下配置可直接将前端数据映射进bean中。
    @RequestMapping(value="/addUser",method= RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String regist(@RequestBody String str) throws Exception {
        System.out.println("表单提交成功！"+" /用户名是"+str);
//        userService.addUser(user);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/showUser" ,method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public List<User> showUser(Model model) throws Exception{
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return userList;
    }

    @RequestMapping("addUserlike")
    public void addLike(HttpServletRequest request, HttpServletResponse response, UserLike userLike) throws Exception {
        userLike.setUser_name(request.getParameter("userName"));
        userLike.setUser_like(request.getParameter("userLike"));
        userService.addUserlike(userLike);
        System.out.println("主键值为："+userLike.getId());
        request.getRequestDispatcher("success.jsp").forward(request,response);
    }
}

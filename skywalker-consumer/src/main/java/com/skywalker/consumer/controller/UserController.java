package com.skywalker.consumer.controller;

import com.skywalker.api.service.user.UserService;
import com.skywalker.domain.user.User;
import com.skywalker.domain.user.UserLike;
import com.skywalker.domain.user.UserVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
@RequestMapping("/")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    //属性名和前端name一一对应，如下配置可直接将前端数据映射进bean中。
    @RequestMapping(value="addUser",method= RequestMethod.POST)
    public String regist(User user) throws Exception {
        System.out.println("表单提交成功！"+" /用户名是"+user.getLoginname());
//        user.setLoginname(request.getParameter("loginname"));
//        user.setLoginpass(request.getParameter("loginpass"));
//        user.setEmail(request.getParameter("email"));
        userService.addUser(user);
        //request.setAttribute("code","success");
        //request.setAttribute("msg","注册成功！");
        // request.getRequestDispatcher("jsps/msg.jsp").forward(request,response);
        //System.out.println("1");
        // request.getRequestDispatcher("success.jsp").forward(request,response);
        return "success";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request,Model model){
        log.info("查询所有用户信息");
        //List<UserVo> userList = userService.getAllUser();
        List<UserVo> userList = new ArrayList<>();
        UserVo userVo = new UserVo();
        userVo.setUser_name("张三");
        userVo.setId(1);
        userVo.setUser_like("篮球");
        userVo.setEmail("ok");
        userList.add(userVo);
        model.addAttribute("userList",userList);
        return "showUser";
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

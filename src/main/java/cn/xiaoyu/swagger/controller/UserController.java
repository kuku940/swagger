package cn.xiaoyu.swagger.controller;

import cn.xiaoyu.swagger.domain.GenderEnum;
import cn.xiaoyu.swagger.domain.ObjectResponse;
import cn.xiaoyu.swagger.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.xiaoyu.swagger.domain.Response.FAIL;
import static cn.xiaoyu.swagger.domain.Response.SUCCESS;

@Api(value = "用户页", tags = {"类上的Tag标签"})
@Slf4j
@RequestMapping("/api/user")
@RestController
public class UserController {
    @PostMapping("/login")
    @ApiOperation(nickname = "LoginRequest", value = "用户登录请求", tags = {"方法上的Tag标签"}, notes = "用户登录请求必须用POST请求")
    public ObjectResponse<User> login(User user) {
        log.info("用户登录信息{}", user);
        if (user.getUid() == null) {
            user.setUid(1L);
        }
        return new ObjectResponse<>(user, SUCCESS, null);
    }

    @PostMapping("/regist")
    @ApiOperation(nickname = "RegistRequest", value = "用户注册请求", tags = {"方法上的Tag标签"}, notes = "用户注册请求必须用POST请求")
    public ObjectResponse<User> regist(User user) {
        log.info("用户注册信息{}", user);
        if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            return new ObjectResponse<>(user, SUCCESS, null);
        } else {
            return new ObjectResponse<>(null, FAIL, "用户账号密码不正确");
        }
    }

    @PostMapping("/findById")
    @ApiOperation(nickname = "findById", value = "用户查询请求", tags = {"方法上的Tag标签"}, notes = "用户查询请求必须用POST请求")
    public ObjectResponse<User> findById(Long id) {
        log.info("用户查询请求: {}", id);
        User user = new User() {{
            setUid(id);
            setUsername("admin");
            setPassword("123456");
            setGender(GenderEnum.MAN);
        }};
        return new ObjectResponse<>(user, SUCCESS, null);
    }
}

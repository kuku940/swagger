package cn.xiaoyu.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "首页", tags = {"类上的Tag标签"})
@Slf4j
@RequestMapping("/api/index")
@RestController
public class IndexController {
    @GetMapping("/hello")
    @ApiOperation(value = "请求首页", tags = {"方法上的Tag标签"}, notes = "方法上的notes标签")
    public String hello() {
        log.info("springboot的第一个controller");
        return "hello";
    }
}

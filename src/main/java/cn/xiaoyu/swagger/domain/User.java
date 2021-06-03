package cn.xiaoyu.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "用户类", description = "用户实体，存储用户相关字段")
@Data
public class User {
    @ApiModelProperty(value = "主键Id", allowEmptyValue = true)
    private Long uid;

    @ApiModelProperty(value = "登录用户名", required = true, example = "admin")
    private String username;

    @ApiModelProperty(value = "登录密码", required = true, example = "123456")
    private String password;

    @ApiModelProperty(value = "性别", required = false, example = "男")
    private GenderEnum gender;
}

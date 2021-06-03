package cn.xiaoyu.swagger.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum GenderEnum {
    WOMAN(0, "女性"),
    MAN(1, "男性");

    Integer code;
    String desc;

    GenderEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
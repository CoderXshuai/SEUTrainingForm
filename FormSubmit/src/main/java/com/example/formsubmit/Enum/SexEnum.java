package com.example.formsubmit.Enum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.Getter;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:14
 */
@Getter
public enum SexEnum {
    MALE(0, "男"),
    FEMALE(1, "女");
    @EnumValue // 将注解所标识的属性的值存储到数据库中
    private Integer sex;
    @JsonValue
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}

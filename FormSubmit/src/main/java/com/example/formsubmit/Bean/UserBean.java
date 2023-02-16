package com.example.formsubmit.Bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.formsubmit.Enum.SexEnum;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Set;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:03
 */
@Data
@TableName("user")
public class UserBean {
    // 用于设置主键
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private int num;
    private int age;
    private LocalDate birthday;
    private SexEnum sex;
    private String province;
    private String city;
    private String intro;
    @TableField(typeHandler = JacksonTypeHandler.class)
    private Set<String> hobby;
}

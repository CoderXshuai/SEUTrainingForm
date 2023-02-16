package com.example.formsubmit.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.formsubmit.Bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:42
 */
@Mapper
public interface UserMapper extends BaseMapper<UserBean> {

}

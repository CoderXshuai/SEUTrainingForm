package com.example.formsubmit.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.formsubmit.Bean.UserBean;
import com.example.formsubmit.Mapper.UserMapper;
import com.example.formsubmit.Service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:53
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements UserService {
}

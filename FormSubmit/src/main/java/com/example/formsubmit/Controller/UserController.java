package com.example.formsubmit.Controller;

import com.example.formsubmit.Bean.UserBean;
import com.example.formsubmit.Service.UserService;
import com.example.formsubmit.Util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:44
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    Result result;

    @PostMapping("/insert")
    @ResponseBody
    public Result addUser(@RequestBody UserBean userBean) {
        userService.save(userBean);
        result = new Result(true, "注册成功", null);
        return result;
    }


}

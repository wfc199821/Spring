package com.Fc.service.impl;

import com.Fc.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author 吴富潮
 * @Date 2021/3/25 20:45
 * @Version 1.0
 */
@Service("userService")
public class UserService implements com.Fc.service.UserService {
    @Autowired
    private User user;
    @Override
    public void service() {
        user.run();
    }
}

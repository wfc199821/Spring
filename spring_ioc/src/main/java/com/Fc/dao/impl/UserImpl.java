package com.Fc.dao.impl;

import com.Fc.dao.User;
import org.springframework.stereotype.Repository;

/**
 * @Author 吴富潮
 * @Date 2021/3/25 20:39
 * @Version 1.0
 */
@Repository("user")
public class UserImpl implements User {
    @Override
    public void run() {
        System.out.println("run........");
    }
}

package com.hjl.web.service.impl;

import com.hjl.web.service.LoginService;
import com.hjl.web.util.Trace;
import org.springframework.stereotype.Service;

/**
 * @author: HJL
 * @create: 2019-01-18 11:43
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public void login() {
        System.out.println(Trace.tracestr());
    }
}

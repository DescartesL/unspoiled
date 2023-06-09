package com.budu.service;


import com.budu.common.ResponseResult;
import com.budu.dto.LoginDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author blue
 * @description:
 * @date 2021/7/30 14:58
 */
public interface LoginService {

    Map<String, String> getCode(HttpServletResponse response) throws IOException;


    ResponseResult login(LoginDTO vo);
}

package com.budu.service;

import com.budu.common.ResponseResult;
import com.budu.entity.UserAuth;
import com.baomidou.mybatisplus.extension.service.IService;
import com.budu.dto.EmailLoginDTO;
import com.budu.dto.EmailRegisterDTO;
import com.budu.dto.QQLoginDTO;
import com.budu.dto.UserAuthDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blue
 * @since 2021-12-25
 */
public interface UserAuthService extends IService<UserAuth> {

    ResponseResult emailRegister(EmailRegisterDTO emailRegisterDTO);

    ResponseResult updatePassword(EmailRegisterDTO emailRegisterDTO);

    ResponseResult emailLogin(EmailLoginDTO emailLoginDTO);

    ResponseResult qqLogin(QQLoginDTO qqLoginDTO);

    ResponseResult weiboLogin(String code);

    ResponseResult giteeLogin(String code);

    ResponseResult sendEmailCode(String email);

    ResponseResult bindEmail(UserAuthDTO vo);

    ResponseResult updateUser(UserAuthDTO vo);

}

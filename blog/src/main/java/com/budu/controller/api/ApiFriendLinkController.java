package com.budu.controller.api;


import com.budu.annotation.BusinessLogger;
import com.budu.common.ResponseResult;
import com.budu.entity.FriendLink;
import com.budu.service.FriendLinkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 友情链接表 前端控制器
 * </p>
 *
 * @author blue
 * @since 2021-08-18
 */
@RestController
@RequestMapping("/web/friend")
@Api(tags = "友情链接-接口")
@RequiredArgsConstructor
public class ApiFriendLinkController {

    private final FriendLinkService friendLinkService;


    @BusinessLogger(value = "友链模块-用户申请友链",type = "添加",desc = "用户申请友链")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "申请友链", httpMethod = "POST", response = ResponseResult.class, notes = "申请友链")
    public ResponseResult addLink(@RequestBody FriendLink friendLink){
        return friendLinkService.applyFriendLink(friendLink);
    }

    @BusinessLogger(value = "友链模块-用户访问页面",type = "查询",desc = "友链列表")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation(value = "友链列表", httpMethod = "POST", response = ResponseResult.class, notes = "友链列表")
    public ResponseResult webFriendLinkList(){
        return friendLinkService.webFriendLinkList();
    }

}


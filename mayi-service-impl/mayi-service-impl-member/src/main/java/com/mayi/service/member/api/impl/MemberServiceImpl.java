package com.mayi.service.member.api.impl;

import com.mayi.service.member.api.MemberService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Author mingjun.fan
 * @Description
 * @Date 14:16 2021/3/31
 **/
@RestController
public class MemberServiceImpl implements MemberService {
    @Override
    public String getUser(Integer userId) {
        return "我是会员服务";
    }
}

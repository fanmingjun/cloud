package com.mayi.service.order.impl;

import com.mayi.service.order.openfeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @Author mingjun.fan
 * @Description
 * @Date 14:50 2021/3/31
 **/
@RestController
public class OrderService {

    @Resource
    private MemberServiceFeign memberServiceFeign;
    /**
     * 基于openfeign客户端形式实现rpc远程调用
     * @return
     */
    @RequestMapping("/orderFeignToMember")
    public String orderFeignToMember(){
        String result = memberServiceFeign.getUser(2);
        return "我是订单服务调用会员服务的接口:"+result;
    }
}

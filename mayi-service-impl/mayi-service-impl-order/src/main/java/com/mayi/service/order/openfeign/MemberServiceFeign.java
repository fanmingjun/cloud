package com.mayi.service.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version V1.0
 * @Author mingjun.fan
 * @Description
 * @Date 14:54 2021/3/31
 **/
@FeignClient("mayi-member")
public interface MemberServiceFeign {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);
}

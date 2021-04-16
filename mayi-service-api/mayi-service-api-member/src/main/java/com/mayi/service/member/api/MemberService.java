package com.mayi.service.member.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface MemberService {

    @GetMapping("/getUser")
    String getUser(Integer userId);
}

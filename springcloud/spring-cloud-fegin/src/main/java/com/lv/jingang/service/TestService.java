package com.lv.jingang.service;

import com.lv.jingang.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="provider-service")
public interface TestService {
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public User getFegin();

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id")String id);
}

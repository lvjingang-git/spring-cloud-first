package com.lv.jingang.service;


import com.lv.configuration.FeginConfiguration;
import com.lv.jingang.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="provider-service")
public interface TestService2 {
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public User getFegin();

    //必须加@PathVariable注解,而且不能使用GetMappering这个注解
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id")String id);

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public User post(User u);

}

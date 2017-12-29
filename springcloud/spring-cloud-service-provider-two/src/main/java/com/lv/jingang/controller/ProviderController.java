package com.lv.jingang.controller;

import com.lv.jingang.entity.User;
import com.lv.jingang.service.ProviderService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 项目名称：springcloud
 *
 * @version 1.0
 * @Package: om.lv.jingang.controller
 * @类名称：${type_name}
 * @类描述：
 * @创建人：吕金刚 lvjgjava@163.com
 * @创建时间：${date} ${time}
 * @修改人：吕金刚 lvjgjava@163.com
 * @修改时间： 2017/12/21 14:23
 * @修改备注：
 **/
@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/test")
    public User test(){
        System.out.println("我是6080--------------------");
        return  providerService.test();
    }
    @GetMapping("eureka-instance")
    public String serviceUrl(){
        InstanceInfo nextServerFromEureka = this.eurekaClient.getNextServerFromEureka("PROVIDER-SERVICE", false);
        return nextServerFromEureka.getHomePageUrl();
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") String id){
        return providerService.get(id);
    }

    @PostMapping("/post")
    public User post(@RequestBody User u){
        return providerService.post(u);
    }
}

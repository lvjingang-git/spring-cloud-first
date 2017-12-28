package com.lv.jingang.controller;

import com.netflix.discovery.EurekaClient;
import com.lv.jingang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
 * @修改时间： 2017/12/21 16:23
 * @修改备注：
 **/
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate template;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/test")
    public User test(){
        //获取微服务的vip地址,通过RestTemplate进行访问
        final String homePageUrl = eurekaClient.getNextServerFromEureka("PROVIDER-SERVICE", false).getVIPAddress();
        String url = "http://"+homePageUrl + "/test";
        System.out.println(url);
        return template.getForObject(url, User.class);
    }
    @GetMapping("/get")
    public String get(){
        return eurekaClient.getNextServerFromEureka("PROVIDER-SERVICE", false).getHomePageUrl();
    }
}

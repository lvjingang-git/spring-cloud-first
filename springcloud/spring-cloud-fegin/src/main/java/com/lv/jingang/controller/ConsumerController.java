package com.lv.jingang.controller;

import com.lv.jingang.entity.User;
import com.lv.jingang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    private TestService testService;

    @GetMapping("/testFegin")
    public User testFegin(){
       return testService.getFegin();
    }

    @GetMapping("/test/{id}")
    public User test(@PathVariable("id") String id){
        return testService.get(id);
    }

    /**
     * 采用自定义的feign
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") String id){
        return testService.get(id);
    }

    /**
     * 采用默认feign
     * @param u
     * @return
     */
    @GetMapping("/post")
    public User post(User u){
        return testService.post(u);
    }
}

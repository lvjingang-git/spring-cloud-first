package com.lv.jingang.entity;

import java.io.Serializable;

/**
 * 项目名称：springcloud
 *
 * @version 1.0
 * @Package: om.lv.jingang.entity
 * @类名称：${type_name}
 * @类描述：
 * @创建人：吕金刚 lvjgjava@163.com
 * @创建时间：${date} ${time}
 * @修改人：吕金刚 lvjgjava@163.com
 * @修改时间： 2017/12/21 14:25
 * @修改备注：
 **/
public class User implements Serializable{

    private static final long serialVersionUID = -9057448481615929836L;

    private String  id;

    private String userName;

    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

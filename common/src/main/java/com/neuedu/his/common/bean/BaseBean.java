package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseBean {
    private String id;
    private Date updateTime;
    private String delFlag;


    /**
     * 在插入之前的准备工作
     */
    public void  preInsert(){
        //1.生成id // 2.给updateTIME赋值
        this.id = UUID.randomUUID().toString().replaceAll("-","");
        //2
        this.updateTime = new Date();
    }

    /**
     * 在更新之前的准备工作
     */

}

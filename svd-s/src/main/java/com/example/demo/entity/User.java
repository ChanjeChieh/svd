package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {

    @TableId()
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String address;
}

package com.family.tree.vo.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

//登录请求Vo

@Getter
@Setter
public class RequestLoginVo {

    private String telephone;

    private String password;

    private String captcha;

}

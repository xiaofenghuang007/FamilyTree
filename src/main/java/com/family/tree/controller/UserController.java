//package com.family.tree.controller;
//
//import com.baomidou.mybatisplus.core.toolkit.StringUtils;
//import com.yellow.donation.common.Result;
//import com.yellow.donation.common.StringConsts;
//import com.yellow.donation.entity.User;
//import com.yellow.donation.service.IUserService;
//import com.yellow.donation.utils.FormatUtils;
//import com.yellow.donation.vo.request.RequestUserRegisterVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
////User控制层
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private IUserService iUserService;
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public Result register(@RequestBody RequestUserRegisterVo requestUserRegisterVo){
//        //判断电话号码格式
//        if (!FormatUtils.isMobile(requestUserRegisterVo.getTelephone())) {
//            System.out.println("电话号码格式错误");
//            return Result.getFail().setMag(StringConsts.TELEPHONE_ERROR);
//        }
//        //判断电话号码是否被注册
//        User user = iUserService.getByTelephone(requestUserRegisterVo.getTelephone());
//        if (StringUtils.checkValNotNull(user)){
//            System.out.println("电话号码已被注册");
//            return Result.getFail().setMag(StringConsts.TELEPHONE_ISUSE);
//        }
//        //判断邮箱格式
//        if (!FormatUtils.isEmail(requestUserRegisterVo.getEmail())) {//工具类正则表达式还没完善
//            System.out.println("电子邮箱格式错误");
//            return Result.getFail().setMag(StringConsts.EMAIL_ERROR);
//        }
//        //判断邮箱是否被注册
//        User user2 = iUserService.getByEmail(requestUserRegisterVo.getEmail());
//        System.out.println("邮箱已被注册");
//        if (StringUtils.checkValNotNull(user2)) {
//            return Result.getFail().setMag(StringConsts.EMAIL_ISUSE);
//        }
//
//        //进行注册
//        if (iUserService.register(requestUserRegisterVo)) {
//            System.out.println("注册成功");
//            return Result.getSuccess().setMag(StringConsts.REGISTER_SUCCESS);
//        }else {
//            return Result.getSuccess().setMag(StringConsts.REGISTER_FAIL);
//        }
//
//    }
//
//}

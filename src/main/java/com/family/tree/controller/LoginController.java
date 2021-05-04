//package com.family.tree.controller;
//
//import com.google.code.kaptcha.Constants;
//import com.google.code.kaptcha.Producer;
//import com.yellow.donation.common.Result;
//import com.yellow.donation.common.StringConsts;
//import com.yellow.donation.vo.request.RequestLoginVo;
//import org.apache.shiro.SecurityUtils;
//import org.apache.tomcat.util.http.fileupload.IOUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.imageio.ImageIO;
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//
//@RestController
//@RequestMapping("/login")
//public class LoginController {
//
//    @Autowired
//    private Producer producer;
//
//    //验证码接口
//    @RequestMapping(value = "/captcha.jpg", method = RequestMethod.GET)
//    public void captcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
//        System.out.println("得到验证码");
//
//        response.setHeader("Cache-Control","no-store,no-cache");
//        response.setContentType("image/jpeg");
//
//        //验证码内容,随机文字
//        String text = producer.createText();
//        //生成图片
//        BufferedImage image = producer.createImage(text);
//
//        //保存到redis
////        ValueOperations forValue = redisTemplate.opsForValue();
////        forValue.set(Constants.KAPTCHA_SESSION_CONFIG_KEY.text);
////        redisTemplate.expire(Constants.KAPTCHA_SESSION_CONFIG_KEY, 60*1000, TimeUnit.MILLISECONDS);
//
//        //保存到session
//        HttpSession session = request.getSession();
//        //设置过期时间为60s
//        session.setMaxInactiveInterval(60);
//        //存入
//        session.setAttribute(Constants.KAPTCHA_SESSION_KEY,text);
//
//        ServletOutputStream outputStream = response.getOutputStream();
//        //图片，格式，输出流
//        ImageIO.write(image,"jpg",outputStream);
//        //关流
//        IOUtils.closeQuietly(outputStream);
//    }
//
//    //登录接口
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public Result toLogin(@RequestBody RequestLoginVo requestLoginVo, HttpSession session, Model model, String inputCaptcha) {
//        //验证session里验证码输入
//        String captcha = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
//        //inputCaptcha为前端用户输入验证码，，，captcha为后台随机生成验证码
//        System.out.println(captcha +"==========================" + inputCaptcha);
//        if (!captcha.equals(inputCaptcha)) {
////            model.addAttribute("msg","验证码错误");
////            return "login/login";
//            return Result.getFail().setMag(StringConsts.KATPCA_ERROR);
//        }
//
//
//        return Result.getSuccess().setMag(StringConsts.Login_SUCCESS);
//    }
//
//    //登出
//    @RequestMapping(value = "/logout", method = RequestMethod.GET)
//    public Result Logout() {
//        SecurityUtils.getSubject().logout();
////        return "login/login";
//        return Result.getSuccess().setMag(StringConsts.Logout_SUCCESS);
//    }
//
//    //未授权
//    @RequestMapping(value = "/noAuth", method = RequestMethod.GET)
//    public String noAuth() {
//        return "noAuth";
//    }
//
//
//}

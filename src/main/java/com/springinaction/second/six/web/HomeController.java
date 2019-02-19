package com.springinaction.second.six.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: eros
 * @Date: 2019/2/15 13:44
 * @Description:
 */
@Controller
// 将控制器映射到"/"
@RequestMapping({"/","/homepage"})
public class HomeController {

    // 处理器方法上的@RequestMapping会对类级别上的@RequestMapping进行补充
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }

}

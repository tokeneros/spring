package com.springinaction.second.five_one_two.web;

import com.springinaction.second.five_one_two.data.SpittleRepository;
import com.springinaction.second.five_one_two.entity.Spitter;
import com.springinaction.second.five_one_two.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: eros
 * @Date: 2019/2/15 14:37
 * @Description:
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

//    private static final String MAX_VALUE = Long.toString(Long.MAX_VALUE);

    private Spitter spitter;

//    private SpittleRepository spittleRepository;

//    public SpittleController() {
//    }

//    @Autowired
//    public SpittleController(SpittleRepository spittleRepository) {
//        this.spittleRepository = spittleRepository;
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittle(Model model){
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));
//        model.addAttribute("spittleList",createSpittleList(20));
        model.addAttribute("spittleList",new ArrayList<>().add(spitter));
        return "spittles";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<Spittle> spittle(@RequestParam(value = "max",defaultValue = MAX_VALUE) long max
//            ,@RequestParam(value = "count",defaultValue = "20") int count){
//        return spittleRepository.findSpittles(max,count);
////        model.addAttribute("spittleList",createSpittleList(20));
//    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>();
        for(int i = 0 ; i < count; i++ ){
            spittles.add(new Spittle("Spittle "+ i,new Date()));
        }
        return spittles;
    }

    /**
     * @auther: eros
     * @param  1
     * @date: 2019/2/15 18:54
     * @description 跳转到注册表单页面
     * @return: java.lang.String
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    /**
     * @auther: eros
     * @param spitter 1
     * @param errors 2
     * @date: 2019/2/15 19:26
     * @description
     * 1.注解@Valid可以校验属性，但是无法阻止表单提交，那么我们必须对校验出错进行处理
     * 2.使用Errors对象，可以使用errors.hasErrors()判断是否有错
     * 记住Errors参数要紧跟在@Valid注解的参数后面
     * @return: java.lang.String
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }
        this.spitter = spitter;
        return "redirect:/spitter";
    }

}

package com.springinaction.second.six.web;

import com.springinaction.second.six.entity.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @Auther: eros
 * @Date: 2019/2/19 09:50
 * @Description:
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping
    public String showRegistrationForm(Model model){
        Spitter spitter = new Spitter();
        model.addAttribute(spitter);
        return "sfRefister";
    }

    @InitBinder
    public void InitBinder(DataBinder binder){
        // 设置验证的类为UserValidator
        binder.setValidator(new SpitterValidator());
    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String processRegistration(@Valid Spitter spitter, Errors errors){
//        if(errors.hasFieldErrors()){
//            System.out.println("校验失败");
//            return "registerForm";
//        }
//        System.out.println("校验成功");
//        return "redirect:/spitter";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(){
        return "registeration";
    }

}

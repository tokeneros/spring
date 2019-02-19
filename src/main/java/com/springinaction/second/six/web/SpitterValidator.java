package com.springinaction.second.six.web;

import com.springinaction.second.six.entity.Spitter;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Auther: eros
 * @Date: 2019/2/19 10:42
 * @Description:
 */
public class SpitterValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Spitter.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "username", null, "username must be between {min} and {max} characters long");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "password must be between {min} and {max} characters long");
        ValidationUtils.rejectIfEmpty(errors, "firstName", null, "First name must be between {min} and {max} characters long");
        ValidationUtils.rejectIfEmpty(errors, "lastName", null, "Last name must be between {min} and {max} characters long");
    }
}

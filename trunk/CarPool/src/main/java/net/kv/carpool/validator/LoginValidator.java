package net.kv.carpool.validator;

import net.kv.carpool.domain.LoginForm;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator
{
    @Override
    public boolean supports(Class<?> clazz)
    {
        return LoginForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors)
    {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "j_username", "user.name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "j_password", "password.required");
        LoginForm loginForm = (LoginForm) target;
        if (loginForm.isFailed())
        {

            errors.rejectValue("failed", "login.failure");

        }
    }

}

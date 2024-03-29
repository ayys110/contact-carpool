package net.kv.carpool.controller;

import javax.servlet.http.HttpServletRequest;

import net.kv.carpool.domain.LoginForm;
import net.kv.carpool.validator.LoginValidator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author venkatesh.kyama
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    private LoginValidator loginValidator;
    @Autowired
    LoginForm loginForm;
    private Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String showUserForm(ModelMap model, HttpServletRequest httpServletRequest)
    {
        logger.debug("showUserForm");

        if (null != httpServletRequest.getUserPrincipal())
        {
 
            return "home";
 
        }
        model.addAttribute("loginForm", loginForm);
        return "loginForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("loginForm") LoginForm loginForm, BindingResult result, HttpServletRequest req)
    {
        logger.debug("onSubmit");
        loginValidator.validate(loginForm, result);
        if (result.hasErrors())
        {
            return "loginForm";
        }
        else
        {
            return "index";
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value ="/here")
    public String success(@ModelAttribute("loginForm") LoginForm loginForm, BindingResult result)
    {
        
            return "index";
       
    }
}

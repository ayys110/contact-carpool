package net.kv.carpool.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author venkatesh.kyama
 * 
 */
@Controller
@RequestMapping("logout")
public class LogoutController
{

    private static Logger logger = Logger.getLogger(LogoutController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String showUserForm(ModelMap model, HttpServletRequest httpServletRequest)
    {
        logger.debug("entered into showUserForm");
        httpServletRequest.getSession().invalidate();
        logger.debug("exiting from showUserForm");

        return "redirect:login";

    }

}
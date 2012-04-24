/**
 * BaseController.java is used for
 * 
 * @author chaitanya Created on Apr 6, 2012
 */
package net.kv.carpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chaitanya
 * 
 */
@Controller
@RequestMapping(value = "/where")
public class BaseController
{

    @RequestMapping(method = RequestMethod.GET)
    public String onGet()
    {
        return "index";
    }
}

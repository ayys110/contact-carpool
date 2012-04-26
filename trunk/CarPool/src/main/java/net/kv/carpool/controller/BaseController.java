/**
 * BaseController.java is used for
 * 
 * @author chaitanya Created on Apr 6, 2012
 */
package net.kv.carpool.controller;

import org.apache.log4j.Logger;
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
    private Logger logger = Logger.getLogger(BaseController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String onGet()
    {
        logger.debug("in base controller");
        return "index1";
    }
    @RequestMapping("index")
    public String gotoindex1()
    {
        logger.debug("in base controller in gottoindex1");
        return "index";
    }
}

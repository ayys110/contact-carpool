/**
 * BaseControllerTest.java is used for
 * 
 * @author chaitanya Created on Apr 17, 2012
 */
package net.kv.carpool.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author chaitanya
 * 
 */
//@ContextConfiguration
//@RunWith(SpringJUnit4)
public class BaseControllerTest implements ApplicationContextAware
{

    GenericXmlApplicationContext xmlBean = new GenericXmlApplicationContext("/WEB-INF/cp-servlet.xml");

    private BaseController baseController;

    @Test
    public void test()
    {
        assertEquals("/index", baseController.onGet());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        // baseController
        baseController = (BaseController) applicationContext.getBean("baseController");
    }

}

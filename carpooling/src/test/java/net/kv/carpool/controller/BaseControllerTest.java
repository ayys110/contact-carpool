/**
 * BaseControllerTest.java is used for 
 * 
 * @author chaitanya
 * Created on Apr 17, 2012
 */
package net.kv.carpool.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author chaitanya
 *
 */
//@ContextConfiguration
//@RunWith(SpringJUnit4)
public class BaseControllerTest {

	GenericXmlApplicationContext xmlBean = new GenericXmlApplicationContext("classpath*:/cp-servlet.xml");
	
	private BaseController baseController;
	@Test
	public void test() {
		baseController = (BaseController) xmlBean.getBean("baseController");
		assertEquals("/index", baseController.onGet());
	}

	
}

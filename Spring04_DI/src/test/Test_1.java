package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.di.MessageBean;

public class Test_1 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/messageBean.xml");
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		bean.sayHello();
	}
}

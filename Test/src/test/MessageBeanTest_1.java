package test;

import org.apache.naming.resources.ClasspathURLStreamHandler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.kosta.service.MemberService;

public class MessageBeanTest_1 {

	public static void main(String[] args) throws Exception{
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("resources/messageBean1.xml");
		
		MemberService bean=factory.getBean("message1", MemberService.class);
		
		System.out.println(bean.msg());
		
	}

}

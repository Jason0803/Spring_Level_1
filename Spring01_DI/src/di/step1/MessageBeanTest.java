package di.step1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MessageBeanTest {

	public static void main(String[] args) {
		// 1. Read Config. Doc
		Resource r = new FileSystemResource("src/bean.xml");
		System.out.println("1. Bean Config. Doc Successfully Read !");
		
		// 2. Bean Factory
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println("2. BeanFactory Created !");
		
		// 3.
		System.out.println("3. Bean Getting..");
		MessageBean bean1 = (MessageBean) factory.getBean("beanKr");
		MessageBean bean2 = (MessageBean) factory.getBean("beanEn");
		
		// 4.
		bean1.sayHello("스프링");
		bean2.sayHello("Spring");
	}

}

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
				new ClassPathXmlApplicationContext("resources/messageBean.xml");
		
	
		//3. »ý¼ºµÇ¾î¼­ °øÀåÀÌ °¡Áö°í ÀÖ´Â ºóÀ» ¿äÃ» :: getBean()
		System.out.println("3. °øÀå¿¡¼­ ºóÀ» °¡Á®¿É´Ï´Ù...");
		MemberService bean=factory.getBean("messageBean", MemberService.class);
		
		
		//4. ºóÀÇ ¸Þ¼Òµå¸¦ ¼öÇà...°á°ú¸¦ È®ÀÎ
		System.out.println("4. ºóÀÇ ¸Þ¼Òµå¸¦ È£Ãâ..."+ bean.msg());
		
	}

}

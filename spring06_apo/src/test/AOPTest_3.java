package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prob.target.ProductService;
import solv2.MemberService;

public class AOPTest_3 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/sov2.xml");
		
		MemberService mem = factory.getBean("member", MemberService.class);
		ProductService pro = factory.getBean("product", ProductService.class);
		
		mem.register();
		System.out.println("===========");
		pro.deleteProduct();
		
	}

}

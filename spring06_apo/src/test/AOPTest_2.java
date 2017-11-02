package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import solv1.MemberService;
import solv1.ProductService;
import solv1.ServiceAdvice;

public class AOPTest_2 {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ProductService ps = new ProductService();
		ServiceAdvice advice = new ServiceAdvice();
		
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(ms);
		pfBean.addAdvice(advice);
		
		MemberService pfMem = (MemberService)pfBean.getObject();
		pfMem.register();
		
		ms.register();

	}

}

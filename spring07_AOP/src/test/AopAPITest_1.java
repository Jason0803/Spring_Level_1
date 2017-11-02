package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import api1.Message;
import api1.MessageAdvice;
import api1.MessageImpl;

public class AopAPITest_1 {

	public static void main(String[] args) {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(new MessageImpl("AOPAPI"));
		
		// 1. Target >> 'Point Cut'
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		// 2. 'search..' method(s) of Target
		pointcut.setMappedName("search*");
		
		// 3. Add advisor on pfBean
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new MessageAdvice()));
		
		// 4. Get target instance from pfBean
		Message msg = (Message)pfBean.getObject();
		msg.searchMember("jason");
	}

}

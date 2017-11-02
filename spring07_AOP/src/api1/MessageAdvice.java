package api1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[MessageAdvice] : 1. Before invocation.proceed()");
		Object obj = invocation.proceed();
		
		System.out.println("[MessageAdvice] : 2. After invocation.proceed()");
		
		if(obj != null) {
			System.out.println("[MessageAdvice] : Return from target :: " + obj);
		}
		
		return obj;
	}
	
}

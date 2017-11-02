package solv1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ServiceAdvice implements MethodInterceptor {
	private Log log = LogFactory.getLog(getClass());
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("Check...before...log");
		Object obj = invocation.proceed();
		System.out.println("obj :: " + obj);
		
		log.info("Check...after...log");
		return obj;
	}

}

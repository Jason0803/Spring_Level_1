package di.step1;

public class MessageBeanKR implements MessageBean {
	MessageBeanKR() {
		System.out.println("HI BEAN !");
	}
	@Override
	public void sayHello(String str) {
		System.out.println("안녕 !");
	}
}

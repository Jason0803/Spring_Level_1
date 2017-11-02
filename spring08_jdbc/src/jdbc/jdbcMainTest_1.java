package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcMainTest_1 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		MemberVO vo = new MemberVO("1010", "1010", "jason", "Paju");
		
		dao.register(vo);
		System.out.println("register ok..");
	}

}

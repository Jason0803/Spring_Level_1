package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcMainTest_1 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		MemberVO vo = new MemberVO("1010", "1010", "jason", "Paju");
		
		//dao.register(vo);
		System.out.println("Get All Members..");
		for(MemberVO m : dao.getList()) {
			System.out.println(m);
		}
		
		System.out.println("Find Member with id 'jason@gmail.com'");
		MemberVO m = dao.getSearch("jason@gmail.com");
		System.out.println(m);
	}

}

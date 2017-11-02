package prob.target;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * �����Ͻ� ������ ����ִ� Target Ŭ����
 * �ٽ����� ������ ���̿� �μ����� ���ɰ�( Cross Cutting Concern)�� ��������� ����ִ�.
 * OOP�� ������ �帮�� �ִ�.
 */
public class MemberService {
	private Log log = LogFactory.getLog(getClass());
	//�����Ͻ� ����...
	
	public void register() {
		//�����Ͻ� ������ ����ֵ�...
		System.out.println("ȸ������ ��ϵǾ����ϴ�....");
		log.info("register member...."); //�μ����� ���ɻ�
	}
	
	public void findMemberById(String id) {
		//�����Ͻ� ������ ����ֵ�...
		System.out.println( id+" �� ȸ���� �˻�......");
		log.info("findMemberById member...."); //�μ����� ���ɻ�
	}
}




















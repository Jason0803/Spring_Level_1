package api1;

public class MessageImpl implements Message {
	private String message;
	
	public MessageImpl(String message) {
		super();
		this.message = message;
	}

	@Override
	public String print() {
		
		return "[MessageImpl] : G'Day !";
	}

	@Override
	public String message() {
	
		return message;
	}

	@Override
	public void searchMember(String id) {
		System.out.println("[MessageImpl] : searchMember CALLED : " + id);
	}

	@Override
	public void searchMemberByAddress(String address) {
		System.out.println("[MessageImpl] : searchMemberByAddress CALLED : " + address);	
	}

}

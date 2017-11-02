package api1;

public interface Message {
	String print();
	String message();
	// --------------------------- searchMember --------------------------- //
	void searchMember(String id);
	void searchMemberByAddress(String address);
	
}

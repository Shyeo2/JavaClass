package interfaceee;

public interface PhoneInterface {
	final int TIMEOUT = 10000;		//상수필드선언
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");

	}
	
}

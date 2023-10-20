interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class InterfaceEx1 implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
public class InterfaceEx{
	public static void main(String[] args) {
		InterfaceEx1 phone = new InterfaceEx1();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package ex03;

public class SmartPhone extends Phone{
	
//	private String model;
//	private String color;
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone");
	}
	
	public SmartPhone(boolean wifi) {
		System.out.println("SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}
	
	
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model,color);
		System.out.println("String model, String color, boolean wifi");
		this.wifi = wifi;
	}
	@Override//어노테이션 sendVoice는 상위클래스를 재정의한다.
	public void sendVoice(String message) {
		System.out.println("음성메세지 : " + message);
	}
	
	
	
	
//	public void bell() {
//		System.out.println("전화 벨이 울렸다");		
//	}
//	public void sendVoice(String message) {
//		System.out.println("자신 : " + message);
//	}
//	
//	public void receiveVoice(String message) {
//		System.out.println("상대방 : " + message);
//	}
//	
//	public void hangUp() {
//		System.out.println("전화를 끊습니다.");
//	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());;//상위클래스 toString 메소드 호출
		return "SmartPhone [wifi=" + wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷 연결");
	}
	


}

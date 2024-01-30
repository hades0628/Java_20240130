package ex03;

public class PhoneController {

	public static void main(String[] args) {
		
//		Phone p = new Phone("m1","흰색");
//		
//		System.out.println(p.toString());
//		System.out.println(p);
		
//		SmartPhone sp = new SmartPhone("m2","검정",true);
//		
//		System.out.println(sp.toString());
		
//		NewestPhone np = new NewestPhone();
		
		SmartPhone sp = new SmartPhone();
		sp.sendVoice("문자보내기");

	}

}

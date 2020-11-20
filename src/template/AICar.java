package template;

public class AICar extends Car{
	public void drive() {
		System.out.println("자율주행합니다");
		System.out.println("자동차가 알아서 방향을 전환합니다");
	}
	
	public void stop() {
		System.out.println("스스로 멈춤니다");
	}
	public void wiper() {
		System.out.println("비나 눈에 따라 빠르기가 자동조절 됩니다");
	}

}

package test.auto;

public class SportsCar extends Car{
	public SportsCar(Engine engine) {
		super(engine);
	}
	//메소드는 첫글자는 소문자로 시작하는게 좋다. 클래스는 대문자.
	public void fastRun() {
		System.out.println("빠르게 달려요!");
	}
}

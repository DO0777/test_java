package test.mypac;

//인터페이스는 다중으로 중첩시킬수 있다. 클래스는 안됨
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("체널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("체널을 내려요");
	}

}

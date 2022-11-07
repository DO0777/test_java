package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCar;

public class TestMain01 {
	public static void main(String[] args) {
		Car c1 = new SportsCar(new Engine());
		SportsCar sc1 = (SportsCar)c1;
		sc1.fastRun();
	}
}

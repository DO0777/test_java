package test.main;

import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.width = 10;
		r1.height = 20;
		r1.showArea();
		
		Rect r2 = new Rect();
		r2.width = 5;
		r2.height = 10;
		r2.showArea();
	}
}

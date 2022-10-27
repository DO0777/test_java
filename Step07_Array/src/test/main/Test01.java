package test.main;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		Random ran = new Random();
		
		int ranNum = ran.nextInt(5);
		int ran1 = ran.nextInt(5);
		int ran2 = ran.nextInt(5);
		int ran3 = ran.nextInt(5);

		System.out.println(items[ranNum]);
		
		System.out.println(items[ran1]+ " | "+items[ran2]+" | "+items[ran3]);
		
		if(ran1==ran2 && ran2==ran3) {
			System.out.println("당첨됐습니다.");
		}else {System.out.println("꽝입니다.");}
	}
}

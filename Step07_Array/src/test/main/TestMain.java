package test.main;

import java.util.Random;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		int point = 1000;
		Scanner scan = new Scanner(System.in);
		while(point != 0) {
			//만일 point 가 0 이면
			if(point == 0) {
				break;//반복문 loop 탈출
			}
			System.out.println("Enter 를 치세요");
			//Enter 를 칠때까지 블로킹되는 메소드 호출
			scan.nextLine();
			//point 를 10 감소 시키면서
			point -= 10;
			//원하는 작업 수행...
			String[] items = {"cherry", "apple", "banana", "malon", "7"};
			//랜덤한 숫자를 얻어내기 위한 객체
			Random ran = new Random();
			
			//for 문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열객체 생성
			int[] nums = new int[3];
			
			for(int i=0; i<3; i++) {
				// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
				int ranNum = ran.nextInt(5);
				//배열의 인덱스로 활용해서 문자열 출력하기
				//println은 개행기호가 같이 출력된다. 개행기호를 출력하지 않려면 print
				System.out.print(items[ranNum]);
			
				if(i < 2) {
					System.out.print(" | ");
				}
				//배열에 얻어낸 랜덤한 숫자를 저장하기
				nums[i]=ranNum;
			}
			System.out.println();
			
			//3개 가 모두 같은지 여부
			boolean isAllEqual = nums[0] == nums[1] && nums[1] == nums[2];
			//2개가 같은지 여부
			boolean isTwoEqual = nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2];
			/*
			 * 점수는 10 , 5, 0
			 */
			if(isAllEqual) {
				System.out.println("10점입니다.");
			}else if(isTwoEqual) {
				System.out.println("5점입니다.");
			}else {
				System.out.println("0점입니다.");
			}
			
		}
		
		
	}
}

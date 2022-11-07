package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
 * 	c:/acorn202210/myFolder/memo.txt 파일에 기록된 문자열을 읽어서
 * 	콘솔창에 출력해보세요.
 * 	- hint
 * 	FileReader 객체를 잘 활용해 보세요.
 */
public class MainClass14 {
	public static void main(String[] args) {
		//File 객체
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");
		
		//필요한 객체를 담을 지역변수를 미리 만들어준다.
		FileReader fr=null;
		BufferedReader br=null;
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			fr = new FileReader(memoFile);
			br = new BufferedReader(fr);
			//반복문 돌면서
			while(true) {
				//개행기호를 기준으로 한줄씩 일어오기 때문에 개행기로는 읽어오지 않는다.
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
	        }
			//다사용한 객체는 close를 해줘야 항시 실행상태를 벗어날 수 있기때문에 마무리 작업이 필수 있다.
			//안드로이드 앱이라면 잠깐 사용하는게 아니라 무수히 많은 객체들을 실행하기때문에
			//계속 메모리를 차지하게되고 가득찬 메모리는 문제를 야기할수 있다.
			//fr 과 br은 try 안에서 만들어졌을때는 try 안에서 close를 해줘야 적용이된다. 
			//fr.close();
			//br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//마무리 작업을 해줘야하는데...
			try {
				//만약 fr이 null 이라면 exception 이 발생하고 닫는 작업이 수행이 안될수도 있다.
				//그렇기에 null인 것을 확인하는 코디을 해준다.
				//닫는 작업은 열린 순서의 역순으로 하면 좋다.
				if(br!=null)br.close();
				if(br!=null)fr.close();
			} catch (IOException e) {}
			
		}
	}
}

package frame03;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//JFrame은 gui를 구성하는 프로그래밍
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountThread;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {
		super(title);
		//프레임의 초기 설정 작업하기
		this.setBounds(100, 100, 500, 500);
		// 이 프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 설정
		this.setLayout(new FlowLayout());
		
		JButton startBtn = new JButton("카운트 다운 시작");
		startBtn.addActionListener(this);
		//프레임에 버튼 추가
		add(startBtn);
		
		JTextField tf = new JTextField(10);
		//프레임에 JTextField 추가
		add(tf);
		
		//프레임을 화면상에 실제 보이게 하기 (false 하면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	//run 했을떄 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		//MyFrame 객체생성하기
		new MyFrame("나의 프레임3");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("카운트 다운을 시작 합니다.");
		new CountThread().start();
		
	}
}

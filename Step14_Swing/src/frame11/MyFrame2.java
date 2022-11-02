package frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame2 extends JFrame implements ActionListener {
   //필드
   JTextField tf_num1, tf_num2;
   JLabel label_result;
   
   
   //default  생성자
   public MyFrame2() {
      //프레임의 레이아웃 법칙 설정하기 
      setLayout(new BorderLayout());
      
      //JPanel
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      //Panel 을 북쪽에 배치하기 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField 객체를 만들에서 JPanel 에 추가하기 
      tf_num1=new JTextField(10);
      topPanel.add(tf_num1);
      
      //기능 버튼 객체를 만들어서 JPanel 에 추가하기
      //ActionCommand 를 따로 해주지 않으면 버튼텍스트가 자동으로 액션커맨드가 된다.
      JButton plusBtn=new JButton("+");
      JButton minusBtn=new JButton("-");
      JButton multiBtn=new JButton("*");
      JButton divideBtn=new JButton("/");
      
      topPanel.add(plusBtn);
      //plusBtn.setActionCommand("plus");
      topPanel.add(minusBtn);
      //minusBtn.setActionCommand("minus");
      topPanel.add(multiBtn);
      //multiBtn.setActionCommand("multi");
      topPanel.add(divideBtn);
      //divideBtn.setActionCommand("divide");
      
      //두번째 JTextField  만들어서 페널에 추가 하기 
      tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      
      //JLabel
      JLabel label1=new JLabel("=");
      label_result=new JLabel("0");
      
      //페널에 레이블 추가하기
      topPanel.add(label1);
      topPanel.add(label_result);
      
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);
      
   }
   
   public static void main(String[] args) {
      //MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
      MyFrame2 frame=new MyFrame2();
      //프레임의 제목 설정
      frame.setTitle("계산기");
      //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		//1.입력한 문자열을 읽어와서 숫자로 바꿔준다.
		//2.어떤 버튼을 눌렀는지 알아내서 적절한 연산을 해서 결과를 얻어낸다.
		//3.연산의 결과를 출력한다.
	   String command=e.getActionCommand();
	   String a1= tf_num1.getText();
	   String a2= tf_num2.getText();
	   try{
	      double num1=Double.parseDouble(a1);
	      double num2=Double.parseDouble(a2);
	   
	      if(command.equals("+")) {
	    	  label_result.setText(Double.toString(num1+num2));
	      }else if(command.equals("-")) {
	    	  label_result.setText(Double.toString(num1-num2));
	      }else if(command.equals("*")) {
	    	  label_result.setText(Double.toString(num1*num2));
	      }else if(command.equals("/")) {
	    	  label_result.setText(Double.toString(num1/num2));
	      }
	      
	   }catch(NumberFormatException nfe) {
	    	  JOptionPane.showMessageDialog(MyFrame2.this, "숫자를 입력하세요!");
	   }
	}
}
/*
 *	하나의 application 을 개발하기 위해
 * 	1000 줄의 코딩을 해야 한다면
 * 	한줄마다 매번 확인을 해야하나?
 * 	-그렇지는 않고 확인을 해야 하는 시점에 System.out.println();
 * 	으로 작동이 되는지 확인해보고 다시 코딩하면 된다.	
 */

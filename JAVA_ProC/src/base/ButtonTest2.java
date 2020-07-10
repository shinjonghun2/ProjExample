package base;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(800, 100, 1000, 500);
		f.setLayout(new FlowLayout());//
		
		
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		//FlowLayout에서는 버튼 크기 변경이 btn1.setSize(200,100)로는 안됨 
				//btn1.setPreferredSize로 변경 가능
				//Dimension클래스의 객체를 생성하여 너비와 높이를 변경 
		btn1.setPreferredSize(new Dimension(200,100));
		btn2.setPreferredSize(new Dimension(200,100));
		btn3.setPreferredSize(new Dimension(200,100));
		btn4.setPreferredSize(new Dimension(200,100));
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
	}
	//버튼 이벤트 세부 
	static ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼에 부착되어 있는 제목을 인지 
			System.out.println(e.getActionCommand());
			
			if(e.getActionCommand().equals("1")) {
				System.out.println("1번 눌렀음");
			}else if (e.getActionCommand().equals("2")) {
				System.out.println("2번 눌렀음");
			}else if (e.getActionCommand().equals("3")) {
				System.out.println("3번 눌렀음");
			}else if (e.getActionCommand().equals("4")) {
				System.out.println("4번 눌렀음 ");
			}
		}
	};

}

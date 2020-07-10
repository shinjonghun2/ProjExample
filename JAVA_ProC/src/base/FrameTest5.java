package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//프레임에서 x버튼 이벤트를 등록  
public class FrameTest5 {

	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
		
		fr.setBackground(Color.lightGray);
		fr.setTitle("다섯번째 사용자 프레임 ");
		
		//감지자는 WindowListener를 구현하고 있는 MyEventListener클래스 이다 .
		
		//객체지향 (WindowListener 전체)
		//fr.addWindowListener(new MyEventListener());
		
		//부분 객체지향 
		//fr.addWindowListener(new WinClosingListener());
		
		//익명의 클래스 (오직 하나)  (하나의 메소드만 쓸때는 이방법이 효울적)
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
						
		}); 
	}
}

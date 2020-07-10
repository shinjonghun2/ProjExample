package base;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("첫 프레임 ");//프레이 제목 
		frame.setBounds(800, 100, 400, 300); // (x좌표,y좌표,width,height)
		
		System.out.println(frame.getBounds().getWidth());	//double 형식
		System.out.println(frame.getBounds().height);	//int 형식
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}

}

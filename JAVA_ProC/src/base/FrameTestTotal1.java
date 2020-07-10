package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTestTotal1 {

	public static void main(String[] args) {
		Frame  frame = new Frame("제목");
		
		
		
		//버튼을 배열로 만들기 
		Button[] arbtn = new Button[5];
		
		String[] btnTitle = {"닫기","열기","취소","확인","안녕"};
		
		for(int i=0; i<arbtn.length;i++) {
			arbtn[i]=new Button(btnTitle[i]);
		}
		frame.add(arbtn[0],BorderLayout.EAST);
		frame.add(arbtn[1],BorderLayout.WEST);
		frame.add(arbtn[2],BorderLayout.SOUTH);
		frame.add(arbtn[3],BorderLayout.NORTH);
		frame.add(arbtn[4],BorderLayout.CENTER);
		
		//프레임에 내용물이 있을때  그 내용물의 내용만큼 영역을 확보해 준다 
		frame.pack();
		frame.setVisible(true);

		//닫기 버튼 눌렀을때
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		//x버튼 누를때 
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}
}

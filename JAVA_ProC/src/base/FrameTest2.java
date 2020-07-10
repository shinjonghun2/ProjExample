package base;

import javax.swing.JFrame;

//프레임 닫기 버튼 활성화 
public class FrameTest2 {

	public static void main(String[] args) {
		JFrame fr = new JFrame("두번째");
		fr.setSize(400,300);//가로, 세로 
		fr.setLocation(800, 100);//좌표
		
		//x버튼으로 프레임 닫기 
		//프레임이 닫히면 메모리도 소멸 
		//일반 Frame에는 없는 기능 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}

}

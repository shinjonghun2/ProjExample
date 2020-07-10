package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("질문");
		
		f.setSize(500,250);
		f.setLocation(400, 100);
		
		//레이아웃 없음. 자동배치 끄기 
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		//사이즈를 설정하려면 자동배치를 꺼야 현재크기가 반영된다
		//높이는 안에있는 요소의 사이즈로 결정되므로 크게 의미가 있다.
		day.setSize(150,0);
		day.setLocation(50, 100);//초이스 좌표 (위치)
		
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(day.getSelectedItem());
				
			}
		});
		
		f.add(day);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
	}
}

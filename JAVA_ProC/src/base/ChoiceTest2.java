package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setSize(500,300);
		f.setLocation(500,100);
		f.setLayout(null);
		
		Choice loc = new Choice();
		loc.add("지역선택");
		loc.add("서울");
		loc.add("경기");
		loc.add("인천");
		loc.add("광주");
		loc.add("대구");
		loc.add("대전");
		loc.add("부산");
		
		loc.setSize(150,0);
		loc.setLocation(70, 100);
		loc.addItemListener(new ChoiceHandler());
		
		/*loc.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("지역 : " + loc.getSelectedItem());
				
			}
		});*/
		f.add(loc);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}

}

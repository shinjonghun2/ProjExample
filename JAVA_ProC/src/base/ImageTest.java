package base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 100, 600, 500);
		ImageIcon img = new ImageIcon("cat2.jpg");
		
		JLabel j1 = new JLabel(img);//JLabel에만 ImageIcon을 추가할 수 있다.
		j1.setBounds(50,100,500,266);//원본이지미지의 width, height을 알아야함 
		f.add(j1);
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

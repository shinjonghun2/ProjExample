package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//�����ӿ��� x��ư �̺�Ʈ�� ���  
public class FrameTest5 {

	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
		
		fr.setBackground(Color.lightGray);
		fr.setTitle("�ټ���° ����� ������ ");
		
		//�����ڴ� WindowListener�� �����ϰ� �ִ� MyEventListenerŬ���� �̴� .
		
		//��ü���� (WindowListener ��ü)
		//fr.addWindowListener(new MyEventListener());
		
		//�κ� ��ü���� 
		//fr.addWindowListener(new WinClosingListener());
		
		//�͸��� Ŭ���� (���� �ϳ�)  (�ϳ��� �޼ҵ常 ������ �̹���� ȿ����)
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
						
		}); 
	}
}

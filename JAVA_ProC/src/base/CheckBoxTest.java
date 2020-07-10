package base;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame("����");

		f.setBounds(500, 200, 800, 600);

		f.setLayout(new FlowLayout());

		Label q1 = new Label("1. ���� �оߴ� �����Դϱ�?");

		Checkbox news = new Checkbox("����",true);
		Checkbox sports = new Checkbox("������");
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox music = new Checkbox("����");

		news.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//ü���ڽ��� üũ������    1 : true  üũ������      üũ �����ϸ� 
				String str = e.getStateChange()==1 ? "���� ������" : "���� ��������";
				System.out.println(str);
			}
		});

		Font font = new Font("�������",Font.BOLD,30);
		q1.setFont(font);
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);

		//��Ÿ�� ���� : �������߿� �Ѱ��� ���� (������ư(�ձٸ��))
		Label q2 = new Label("2. ��ȭ�� �Ѵ޿� �󸶳� ���� ���ϱ�? ");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("�ѹ�", group,true);
		Checkbox two = new Checkbox("�ι�", group,false);
		Checkbox three = new Checkbox("����", group,false);

		//������ư ���ÿ��� �Ǵ�
		one.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�ѹ� ���ϴ�");

			}
		});
		two.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�ι� ���ϴ�");

			}
		});
		three.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���� ���ϴ�");

			}
		});
		q2.setFont(font);
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});

	}

}

package base;

import javax.swing.JFrame;

//������ �ݱ� ��ư Ȱ��ȭ 
public class FrameTest2 {

	public static void main(String[] args) {
		JFrame fr = new JFrame("�ι�°");
		fr.setSize(400,300);//����, ���� 
		fr.setLocation(800, 100);//��ǥ
		
		//x��ư���� ������ �ݱ� 
		//�������� ������ �޸𸮵� �Ҹ� 
		//�Ϲ� Frame���� ���� ��� 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}

}

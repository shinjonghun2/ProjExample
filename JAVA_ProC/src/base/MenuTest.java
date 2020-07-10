package base;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuTest {

	public static void main(String[] args) {
		Frame frame = new Frame("�޴�");
		frame.setSize(500,300);
		
		MenuBar menuBar = new MenuBar();
		
		Menu mFile = new Menu("����");
	
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		
		
		
		Menu print = new Menu("print");
		MenuItem printSetup = new MenuItem("����Ʈ �¾�");
		MenuItem printPre = new MenuItem("�̸�����");
		
		print.add(printSetup);
		print.add(printPre);
		
		MenuItem miClose = new MenuItem("Close");
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		menuBar.add(mFile);
		frame.setMenuBar(menuBar);
		frame.setVisible(true);
		
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
		
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}

}

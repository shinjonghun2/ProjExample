package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����Ʈ �¾�")) {
			System.out.println("����Ʈ �¾�");
		}else if(e.getActionCommand().equals("Close")) {
			System.exit(0);
		}
	}

}

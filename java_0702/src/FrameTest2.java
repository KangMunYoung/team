import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest2 extends JFrame {
	Frame frm = new Frame("����");
	
	public FrameTest2() {

		
		Button btn = new Button("�ð�");
		Button btn2 = new Button("�ð�");
		Button btn3 = new Button("�ð�");
		Button btn4 = new Button("�ð�");
		add(btn);
		setVisible(true);
		
		JLabel lbl = new JLabel("��ǥ��", JLabel.CENTER);
		add(lbl);
		lbl.setForeground(Color.pink);
		
		frm.add(btn);
		frm.setSize(500, 300);
		frm.setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new FrameTest2();

	}

}

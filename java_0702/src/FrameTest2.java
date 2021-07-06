import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest2 extends JFrame {
	Frame frm = new Frame("제목");
	
	public FrameTest2() {

		
		Button btn = new Button("시간");
		Button btn2 = new Button("시간");
		Button btn3 = new Button("시간");
		Button btn4 = new Button("시간");
		add(btn);
		setVisible(true);
		
		JLabel lbl = new JLabel("라벨표시", JLabel.CENTER);
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

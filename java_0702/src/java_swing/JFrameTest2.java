package java_swing;

import javax.swing.JFrame;
//						default : BorderLayout
public class JFrameTest2 extends JFrame {

	public JFrameTest2() {
		setSize(500,500);
		setVisible(true);
		//프로그램이 종료되면 자원해제 하거나, 프로그램을 종료할수 없도록 설정할수있다.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		new JFrameTest2();

	}

}
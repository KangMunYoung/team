package java_swing;

import javax.swing.JFrame;
//						default : BorderLayout
public class JFrameTest2 extends JFrame {

	public JFrameTest2() {
		setSize(500,500);
		setVisible(true);
		//���α׷��� ����Ǹ� �ڿ����� �ϰų�, ���α׷��� �����Ҽ� ������ �����Ҽ��ִ�.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		new JFrameTest2();

	}

}
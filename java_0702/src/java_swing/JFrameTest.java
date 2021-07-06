package java_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
//							default : BorderLayout
public class JFrameTest extends JFrame {
	ImageIcon icon1 = new ImageIcon("img/sub0104_01.png");
	ImageIcon icon2 = new ImageIcon("img/IMG_9750.jfif");
	ImageIcon icon3 = new ImageIcon("img/artworks-t4CxhShsS3bMo140-pSYoxw-t500x500.jpg");
	public JFrameTest() {
		//BorderLayout�� GridLayout���� �����ϱ�
		GridLayout layout = new GridLayout(3,2,10,10);
		setLayout(layout);
		
		JButton btn1 = new JButton("����");
		add(btn1);
		JButton btn2 = new JButton(icon1);
		add(btn2);
		//���콺�� ��ư ������ icon �ٲٱ�
		btn2.setPressedIcon(icon2);
		//���콺 ������ icon�ٲٱ�
		btn2.setRolloverIcon(icon3);
		JButton btn3 = new JButton("�Ѹ�",icon2);
		add(btn3);
		//��ư�� Ȱ��ȭ ��Ȱ��ȭ
		btn3.setEnabled(false);
		
		JButton btn4 = new JButton("�׹�����ư");
		add(btn4);
		
		//����� ��ư
		JPanel pane = new JPanel(new GridLayout(2, 1));
		JRadioButton rbtn1 = new JRadioButton("one");
		JRadioButton rbtn2 = new JRadioButton("two");
		JRadioButton rbtn3 = new JRadioButton("three");
		
		//����� ��ư �׷츸���
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtn1); bg.add(rbtn2); bg.add(rbtn3);
		
		
		pane.add(rbtn1);
		pane.add(rbtn2);
		pane.add(rbtn3);
		
		add(pane);
		
		//��۹�ư
		JToggleButton toggleBtn = new JToggleButton("���",icon3);
		toggleBtn.setRolloverIcon(icon1);
		toggleBtn.setSelectedIcon(icon2);
		add(toggleBtn);
		
		//�󺧸����
		JLabel lbl = new JLabel("��ǥ��", JLabel.CENTER);
		add(lbl);
		lbl.setForeground(Color.pink);
		
		//���� �÷������ϱ�
		btn1.setBackground(Color.ORANGE);
		// 				R:0~255 ,G:0~255,B:0~255
		Color clr = new Color(100,120,220);
		toggleBtn.setBackground(clr);
		
		//���ڻ� �÷������ϱ�
		btn1.setForeground(Color.WHITE);
		//���� ��濡 �����ϱ�
		lbl.setBackground(Color.MAGENTA);
		lbl.setForeground(Color.pink);		
		lbl.setOpaque(true); //true : ����ó������ , false:����ó��
		//Font:�۲�(����ü,����ä,Arial,,,,,,,,��������(���ð�,���ϰ�,����)
		//Font(String name, int style, int size)
		Font fnt = new Font("�ü�ü", Font.ITALIC+Font.BOLD , 40);
		lbl.setFont(fnt);
		
		
		setSize(500,500);
		setVisible(true);
		//���α׷��� ����Ǹ� �ڿ����� �ϰų�, ���α׷��� �����Ҽ� ������ �����Ҽ��ִ�.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		//�и��� ��ŭ �Ͻ�����
		try {
			Thread.sleep(5000); //�и���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		//��ư�� ��,Label�� ���� �����ϱ�
		btn1.setText("����� ��ư ��");
		lbl.setText("����� ��ư ��");
		
		
	}

	public static void main(String[] args) {
		new JFrameTest();

	}

}

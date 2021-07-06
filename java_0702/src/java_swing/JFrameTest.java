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
		//BorderLayout을 GridLayout으로 변경하기
		GridLayout layout = new GridLayout(3,2,10,10);
		setLayout(layout);
		
		JButton btn1 = new JButton("유후");
		add(btn1);
		JButton btn2 = new JButton(icon1);
		add(btn2);
		//마우스로 버튼 누를때 icon 바꾸기
		btn2.setPressedIcon(icon2);
		//마우스 오버시 icon바꾸기
		btn2.setRolloverIcon(icon3);
		JButton btn3 = new JButton("둘리",icon2);
		add(btn3);
		//버튼을 활성화 비활성화
		btn3.setEnabled(false);
		
		JButton btn4 = new JButton("네번쨰버튼");
		add(btn4);
		
		//레디오 버튼
		JPanel pane = new JPanel(new GridLayout(2, 1));
		JRadioButton rbtn1 = new JRadioButton("one");
		JRadioButton rbtn2 = new JRadioButton("two");
		JRadioButton rbtn3 = new JRadioButton("three");
		
		//레디오 버튼 그룹만들기
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtn1); bg.add(rbtn2); bg.add(rbtn3);
		
		
		pane.add(rbtn1);
		pane.add(rbtn2);
		pane.add(rbtn3);
		
		add(pane);
		
		//토글버튼
		JToggleButton toggleBtn = new JToggleButton("토글",icon3);
		toggleBtn.setRolloverIcon(icon1);
		toggleBtn.setSelectedIcon(icon2);
		add(toggleBtn);
		
		//라벨만들기
		JLabel lbl = new JLabel("라벨표시", JLabel.CENTER);
		add(lbl);
		lbl.setForeground(Color.pink);
		
		//배경색 컬러설정하기
		btn1.setBackground(Color.ORANGE);
		// 				R:0~255 ,G:0~255,B:0~255
		Color clr = new Color(100,120,220);
		toggleBtn.setBackground(clr);
		
		//글자색 컬러설정하기
		btn1.setForeground(Color.WHITE);
		//라벨의 배경에 설정하기
		lbl.setBackground(Color.MAGENTA);
		lbl.setForeground(Color.pink);		
		lbl.setOpaque(true); //true : 투명처리해제 , false:투명처리
		//Font:글꼴(굴림체,돋움채,Arial,,,,,,,,글자유형(가늘게,진하게,보통)
		//Font(String name, int style, int size)
		Font fnt = new Font("궁서체", Font.ITALIC+Font.BOLD , 40);
		lbl.setFont(fnt);
		
		
		setSize(500,500);
		setVisible(true);
		//프로그램이 종료되면 자원해제 하거나, 프로그램을 종료할수 없도록 설정할수있다.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		//밀리조 만큼 일시정지
		try {
			Thread.sleep(5000); //밀리조
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		//버튼의 라벨,Label의 라벨을 변경하기
		btn1.setText("변경된 버튼 라벨");
		lbl.setText("변경된 버튼 라벨");
		
		
	}

	public static void main(String[] args) {
		new JFrameTest();

	}

}

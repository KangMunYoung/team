import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

//컨테이너 Frame상속받아 구현하기

public class FrameTest extends Frame {
	Point xy = new Point(500, 300);
	Dimension wh = new Dimension(500, 300);
	Rectangle rect = new Rectangle(100, 100, 400, 400);
	public FrameTest() {
		//창의 제목
		//setTitle("스토브리그");
		super("하위에서 제목설정");  //Frame("하위에서 제목설정")
		//창의 크기
		//setSize(500,400);\
		//setSize(wh);
		//		     x    y    w    h
		//setBounds(200, 200, 500, 400); Rectangle x좌표, y좌표, 폭, 높이
		setBounds(rect);
		//setSize(500,500);//w, h	-> Dimension 폭과 높이
		//setLocation(300,300);//x, y -> Point	x좌표, y좌표
		//창을 보여주기
		
		//타이틀바에 이미지 아이콘
		//Toolkit tk = Toolkit.getDefaultToolkit();
		//Toolkit.getDefaultToolkit().getImage("img/sub0104_01.png");	
		Image icon = Toolkit.getDefaultToolkit().getImage("img/sub0104_01.png");
		setIconImage(icon);
		
		//Button
		Button btn = new Button("누르지마세요");
		add(btn);
		
		Button btn1 = new Button("111111");
		Button btn2 = new Button("222222");
		Button btn3 = new Button("333333");
		Button btn4 = new Button("444444");
		//     "North"
		add(BorderLayout.NORTH,btn1);
		add("South",btn2);
		add(BorderLayout.EAST,btn3);
		add(BorderLayout.WEST,btn4);
		
		setVisible(true);//true:보여줌, false:안보여줌(숨겨진다)
	}

	public static void main(String[] args) {
		new FrameTest();

	}
}

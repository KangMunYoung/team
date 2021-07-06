package java_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarSwing extends JFrame implements ItemListener, ActionListener{
	Font fnt = new Font("����ü", Font.BOLD, 20);
	
	//���
	JPanel selectPane = new JPanel(); //�гλ���
		JButton prevBtn = new JButton("��"); //������ư
		JButton nextBtn = new JButton("��"); //������ư
		JComboBox<Integer> yearCombo = new JComboBox<Integer>(); //�⵵ �޺��ڽ��߰�
		JComboBox<Integer> monthCombo = new JComboBox<Integer>(); //�� �޺��ڽ� �߰�
		JLabel yearLBl = new JLabel("��");  //"��"�� ǥ���� �� �߰�
		JLabel monthLBl = new JLabel("��"); //"��"�� ǥ���� ���߰�
		
	//���
	JPanel centerPane = new JPanel(new BorderLayout()); //��� �г��� �����ϰ� borderLayout���� ����ش�. 
														//borderLayout : �����¿� ����� ����� layout�� ��°�
		JPanel titlePane = new JPanel(new GridLayout(1, 7));// Ÿ��Ʋ�� ������ų �г��� �����ϰ� GridLayout���� ����ش�.
															// GridLayout: ������ ���� ��� ���� �����ϴ� ���̾ƿ��̴� 1�� 7���̹Ƿ� ��,��,ȭ,��,��,��,�� �� ���Եȴ�.
			String[] title = {"��", "��", "ȭ", "��", "��", "��", "��"};
		JPanel dayPane = new JPanel(new GridLayout(0, 7)); // ���� �����ϸ� ��¥�� ������ �ȴ�. 
	
	//�޷°��� ������
	Calendar date; //�޷�����
	int year; //���, �� ����
	int month;
	
	public CalendarSwing() {
		super("�޷�"); //super : �θ�Ŭ�����κ��� ��ӹ��� �޼ҵ带 �ڽ�Ŭ������ �����ؼ� ����ϴ� ����
		date = Calendar.getInstance();//������ ��¥ �ð� ��ü ���� + ��ü�� �޾ƿ´�.
		year = date.get(Calendar.YEAR); // Ķ�������� ���� �޾ƿͼ� �̸������س��� year�� �����Ѵ�.
		month = date.get(Calendar.MONTH)+1; //���� �޾ƿͼ� month�� �����Ѵ�. +1�� �ϴ� ������ 0~11�̶�
		
		//���
		selectPane.setBackground(new Color(150, 200, 200)); //��׶����� ����� �����Ѵ�.
		selectPane.add(prevBtn); prevBtn.setFont(fnt);  
		selectPane.add(yearCombo); yearCombo.setFont(fnt);
		selectPane.add(yearLBl); yearLBl.setFont(fnt);
		selectPane.add(monthCombo); monthCombo.setFont(fnt);
		selectPane.add(monthLBl); monthLBl.setFont(fnt);
		selectPane.add(nextBtn); nextBtn.setFont(fnt);  //�гο� �������� �ۼ��� font�� �����Ѵ�.
		
		add(BorderLayout.NORTH, selectPane); // borderLayout : �����¿� ����� ����� layout�� ��°�
											// ���� ���Խ�Ű�� selectPane�� �ִ´�.
		
		//���� ��, �� ����
		setYear();	
		setMonth();
		
		//titleȣ��
		setCalendarTitle();		//�Ͽ�ȭ������並 �������� �޼ҵ� setCalendarTitle�� ȣ���Ѵ�.
		centerPane.add(BorderLayout.NORTH, titlePane);	//�����г��� ���ʿ� title�� �ִ´�(�Ͽ�ȭ�������)
		add(centerPane);
		
		//��¥�����
		centerPane.add(dayPane); //�����гο� ��¥�г��� �߰��Ѵ�.
		setDay();	//setDay()�޼ҵ带 ȣ���Ѵ�.
		
		
		//---------------------------����̺�Ʈ�� �߰�-------------------------------
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
		//��� �̺�Ʈ �ٽõ��
		yearCombo.addItemListener(this);
		monthCombo.addItemListener(this);
		
		//JFrame�� ������
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	//��¥����
	public void setDay() {
		//����
		date.set(year, month-1, 1); //date�� �����ϴµ�, ��(day)�� 1�� �����Ѵ�.
		int week = date.get(Calendar.DAY_OF_WEEK); //DAY_OF_WEEK�� �Ͽ�ȭ��������̸� �̵����͸� �޾ƿͼ� week�� �ִ´�.
		//��������
		int lastDay = date.getActualMaximum(Calendar.DATE); //getActualMaximum �� ��¥�� ���� �� Calender �� ������ �ִ� ��
															//getMaximum �� Calender ��ü�� �ִ�� ������ �ִ� ��
															//���������� �ҷ��´�.
		//����
		for(int s=1; s<week; s++) {  //�ݺ����� ������.
			JLabel lbl = new JLabel(" "); //�鿩����
			dayPane.add(lbl);
		}
		//��¥�߰�
		for(int day=1; day<=lastDay; day++) {
			JLabel lbl = new JLabel(String.valueOf(day), JLabel.CENTER); //�󺧼������ִµ� String.value �� ����ȯ�̴�. JLabel�� ����� �Է��ϰԵд�.
			lbl.setFont(fnt); //�󺧿� ��Ʈ�� �����Ѵ�.
			//����ϴ� ��¥�� ���� ����
			date.set(Calendar.DATE, day); // 19 ->1
			int w = date.get(Calendar.DAY_OF_WEEK); //����
			if(w ==1) lbl.setForeground(Color.red); //�Ͽ�ȭ������� (1~7) 1�� �Ͽ����̹Ƿ� �Ͽ��Ͽ� red����
			if(w ==7) lbl.setForeground(Color.blue); //7�̹Ƿ� blue����
			dayPane.add(lbl);
		}
	}
	//��ȭ��������� ����
	public void setCalendarTitle() { //�޼ҵ�
		for(int i =0; i <title.length; i++) { //������� �迭�� ����ŭ ������.
			JLabel lbl = new JLabel(title[i], JLabel.CENTER); //������� �迭�� ����ŭ label�� ���Խ�Ű�� ����� �����Ѵ�.
			lbl.setFont(fnt); //��Ʈ����
			if(i ==0) lbl.setForeground(Color.red); //setForeground��Ʈ�Ӽ��� �������ִµ� ���°�,
			if(i ==6) lbl.setForeground(Color.blue);
			titlePane.add(lbl); //Ÿ��Ʋ�гο� ���� �߰���Ų��.
		}
	}
	//�⵵����
	public void setYear() {
		for(int i= year-50; i<year+20; i++) { //�ش籸���� �ݺ�����������
			yearCombo.addItem(i); //yearCombo�ڽ��� ��´�.
		}
		yearCombo.setSelectedItem(year); //�޺��ڽ��� ������ �̺�Ʈ�� ���������ֱ����� ����
	}
	//������
	public void setMonth() {
		for(int i=1; i<=12; i++) {
			monthCombo.addItem(i);
		}
		monthCombo.setSelectedItem(month); //���͵�
	}
	
	//�޺��ڽ�Ŭ���̺�Ʈ
	public void itemStateChanged(ItemEvent e) { //�޺��ڽ��� �����Ͽ������� ���õǴ� �̺�Ʈ�̴�.
		year = (int)yearCombo.getSelectedItem(); //����ȯ�Ѱ������� ������ yearCombo�ٲ������ yearCombo�� ���� getSelected �����ͼ� ã�°��� ���� �ִ�.
		month = (int)monthCombo.getSelectedItem();
		
		dayPane.setVisible(false); //�г��� �ݴ´�.
		dayPane.removeAll(); //�����ִ� ��¥ �����
		setDay(); //��¥ ó�� �Լ� ȣ��
		dayPane.setVisible(true); //�г��� �����ְ� ó���Ѵ�.
		
									//���⼭ �ݰ� �����ٰ� ȣ���ϰ�, �ٽ� �����ִ� ������  �ȱ׷��� ȭ���� ���������ʱ� �����̴�.
		
	}
	//��ư�̺�Ʈ 
	public void actionPerformed(ActionEvent ae) {  //�׼��̺�Ʈ(��ư�̺�Ʈ)
		Object obj = ae.getSource(); //Obejct�� �׼��̺�Ʈ�� �ҽ��� �����´�.
		if(obj == prevBtn) {//������ư�� ��������
			//�������� ��������
			prevMonth(); //������ư�޼ҵ�ȣ��
			setDayReset(); //Day�� Reset���ִ� �޼ҵ� ȣ��
		}else if(obj == nextBtn) { //���� ��ư�� ��������
			//�������� ��������
			nextMonth(); //���͵�
			setDayReset(); //���͵�
		}
	}
	private void setDayReset() {
		//��� �̺�Ʈ �������
		yearCombo.removeItemListener(this); //����̺�Ʈ�� ���������ְ�
		monthCombo.removeItemListener(this);
		
		yearCombo.setSelectedItem(year); //yearCombo�� year�� �ش�Ǵ� ���� �����´�.
		monthCombo.setSelectedItem(month);
		
		dayPane.setVisible(false); //�г��� �����ֱ⸦ ��Ų��.
		dayPane.removeAll(); //���������.
		setDay(); //�ش�޼ҵ带 ȣ���Ѵ�.
		dayPane.setVisible(true); //�ٽú����ش�.
		
		yearCombo.addItemListener(this); //�ٽ� �̺�Ʈ�� ��Ͻ�Ų��.
		monthCombo.addItemListener(this); //�ٽ� �̺�Ʈ ���
		
	}
	public void prevMonth() { //��
		if(month==1) { //21.01�� �϶��� 12���� �������鼭 year�� ���⵵�� �ٲ۴�.
			year--;
			month=12;
		}else { //�׿��� ���
			month--; 
		}
	}
	public void nextMonth() {
		if(month==12){ //12���϶����� �⵵�� �߰���Ű�� ���� 1�ιٲ۴�.
			year++; 
			month=1;
		}else{ //�׿��� ���
			month++;
		}
	}
	
	//���۸޼ҵ�
	public static void main(String[] args) {
		new CalendarSwing();
	}
}
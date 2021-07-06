package Empinfor;
import java.util.HashMap;

public class EmpDataSet {
	public static HashMap<String, EmpVO> empList = new HashMap<String,EmpVO>();
	public EmpDataSet() {
		
	}
	//기본데이터 셋팅
	public static void basicEmpSet() { 
		empList.put("홍길동", new EmpVO("11111","홍길동","010-1234-4567",5000,"2020-06-23"));
		empList.put("길가메쉬", new EmpVO("22222","길가메쉬","010-7895-8282",7000,"2015-05-09"));
		empList.put("류승룡", new EmpVO("33333","류승룡","010-7979-5252",6500,"2018-09-23"));
		empList.put("장보고", new EmpVO("44444","장보고","010-1212-6868",5500,"2019-08-23"));
		empList.put("대조영", new EmpVO("66666","대조영","010-2327-4807",6000,"2019-07-23"));
	}
	
	
}

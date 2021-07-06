import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		//로또 번호 생성기
	 System.out.println("로또 번호: 1~45까지 번호 6개\n\t보너스 1개");
	 
	 System.out.print("실행\n게임수=");
	 
	 Scanner scan = new Scanner(System.in);
	 
	 
	 int a = scan.nextInt();
	 	 

	 
	 
	 for (int i=1; i<=100; i++) {
		 System.out.println(i);
	 }
	 
//	 for(int i=0; i< 몇까지 돌거니?; i의 조건방법)
//	 for(int i=0; i<10;i++)
//	 {
//	   	 System.out.print("실행\n게임수=");
//	 }

	}
}

/*
로또 번호 : 1~45까지 번호 6개
		  보너스 1개
		  
실행
게임수 = 3
1게임 = 5,13,26,32,33,45,보너스 11
2게임 = 11,23,26,32,35,41,보너스 9
3게임 = 15,13,26,37,38,43,보너스 23
계속하시겠습니까(1:예, 2:아니오)?1
게임수 = 5
1게임 = 5,13,26,32,33,45,보너스 11
2게임 = 11,23,26,32,35,41,보너스 9
3게임 = 15,13,26,37,38,43,보너스 23
4게임 = 1,23,26,32,33,41,보너스 27
5게임 = 9,13,26,37,38,42,보너스 45
계속하시겠습니까(1:예, 2:아니오)?2
 */
import java.util.Scanner;

public class ArrayEx03_Money {

	public static void main(String[] args) {
		System.out.print("실행\n금액을 입력하세요?");
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
	
	 do {
		 System.out.print("금액=");
		 int money = scan.nextInt();
		 
		 //화폐단위
		 //화폐단위와 갯수를 2차원에 초기화하여 생성한다.
		 int result[][]= {{50000,0},{10000,0},{5000,0},{1000,0},{500,0},{100,0},{50,0},{10,0},{5,0},{1,0}};
		 
		 //화폐단위 계산
		 for(int row=0; row<result.length; row++) {//0,1,2,3,4...9
			result[row][1] = money / result[row][0]; //화폐갯수
			money -= result[row][0]*result[row][1];
		 }
		 //////
		 for(int row=0; row<result.length; row++) {
			 if(result[row][1]>0) {
			 
			 System.out.print(result[row][0]+"="+result[row][1]);
			 if(result[row][0]>=1000) {
				 System.out.println("장");
				
			 }else {
				 System.out.println("개");
			 	}
			 }
		 }
		 
		 
		 
		 //종료확인
		 System.out.print("계속하시겠습니까(1.예, 2.아니요)?");
		 if(scan.nextInt()==2) {
			 break;
		 	}
		 
		 }while(true);
	 
	 
	 }	
}

/*
배열을 이용하여 만들기 

50000,10000,5000,1000,500,100,50,10,5,1

실행
금액을 입력하세요?123300원
50000원=2장
10000원=2장
1000원=3장
100원=3개
다시하시겠습니까(1.예, 2.아니요)?1
금액을 입력하세요.?5435
5000원=1장
100원=4개
30원=3개
1원=5개
다시하시겠습니까(1.예, 2.아니요)?

*/
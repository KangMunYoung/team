import java.util.Scanner;
class DoWhileEx12
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		do{
			//금액
			System.out.print("금액을 입력하세요?");
			int money = scan.nextInt();///4520

			//화폐
			int cnt = money/50000;  //5만원
			if(cnt>0){
				System.out.println("50000원="+cnt+"장");
				money = money - cnt*50000;

		}
		cnt = money/10000;//1만원
		if(cnt>0){
			System.out.println("10000원="+cnt+"장");
			money = money - cnt*10000;
		}
		cnt = money/5000;
		if(cnt>0){
			System.out.println("5000원="+cnt+"장");
			money = money - cnt*5000;
	}
	//
	//
	//
	//
	//질문
			System.out.print("계속하시겠습니까(1.예, 2.아니요)?");
			int status = scan.nextInt();
			if(status==2)	
				break;
		}while(true);
	}
}


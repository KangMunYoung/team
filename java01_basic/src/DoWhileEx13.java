import java.util.Scanner;
class DoWhileEx13
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		do{
			//금액
			System.out.print("금액을 입력하세요?");
			int money = scan.nextInt();////4525120

			//화폐
			int won=50000, divide=5;

			while(money>0){
				int cnt = money/won;//화폐의 갯수
				if(cnt>0){
					System.out.print(won+"원="+cnt);
					if(won>=1000){
						System.out.println("장");
					}else{
						System.out.println("개");
						
					
					}
					money = money - cnt*won;
				}
				won = won / divide;//다음 화폐단위
				//다음 화폐단위 생성시 나눌값을 바꿔져야 한다.
				if(divide==5){
					divide=2;
				}else{
					divide=5;
				
		    }
			System.out.print("계속하시겠습니까(1.예, 2.아니요)?");
			int status = scan.nextInt();
			if(status==2)	
				break;
			}while(true);
			
			}
	}
}




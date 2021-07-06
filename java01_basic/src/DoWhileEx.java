import java.util.Scanner;
class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int i=0, gold=0, opt=1, fivea=0,tena=0,fiveb=0,tenb=0,fivec=0,tenc=0,fived=0,tend=0,fivef=0,tenf=0;
			
		 do
		 {
			 System.out.print("금액을 입력하세요?");
			 gold = scan.nextInt();
			 fivea = gold/50000;
			 gold %= 50000;
			 tena = gold/10000;
			 gold %= 10000;
			 fiveb = gold/5000;
			 gold %=5000;
			 tenb = gold/1000;
			 gold %=1000;
			 fivec = gold/500;
			 gold %=500;
			 tenc = gold/100;
			 gold %=100;
			 fived = gold/50;
			 gold %=50;
			 tend = gold/10;
			 gold %=10;
			 fivef = gold/5;
			 gold %=5;
			 tenf = gold/1;
			 gold %=1;

			System.out.printf("50000원=%d장\n",fivea);
			System.out.printf("10000원=%d장\n",tena);
			System.out.printf("5000원=%d장\n",fiveb);
			System.out.printf("1000원=%d장\n",tenb);
			System.out.printf("500원=%d개\n",fivec);
			System.out.printf("100원=%d개\n",tenc);
			System.out.printf("50원=%d개\n",fived);
			System.out.printf("10원=%d개\n",tend);
			System.out.printf("5원=%d개\n",fivef);
			System.out.printf("1원=%d개\n",tenf);
			System.out.printf("다시하시겠습니까?(1.예, 2.아니요)");
			opt= scan.nextInt();
			 
			 

		 }
		 while (opt !=2);




		
	}
}
/*
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
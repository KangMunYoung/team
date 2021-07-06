import java.util.Scanner;
class IfTestIf 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        
		/*
		    급여를 입력바당 급여가 10000~20000이면 보너스 20%지급
			                  20000~30000이면      15%
							  30000~40000이면      10%
							  40000~50000         5%
							  그외                 0
		*/
		//1. 급여입력
		      System.out.print("급여를 입력하세요?-->");
			  int sal = scan.nextInt();

              int bouns = 0;
			  if(sal>=10000 && sal<=20000){
				  bouns = (int)(sal * 0.2);
			  }else if(sal>=20000 && sal<=30000){
				  bouns = (int)(sal % 0.15);
			  }else if(sal>=30000 && sal<=40000){
				  bouns = (int)(sal % 0.1);
			  }else if(sal>=40000 && sal<=50000){
				  bouns = (int)(sal *0.05);
			  }
			  System.out.printf("급여는=%d, 보너스=%d\n", sal, bouns);
			  
			  
	}
}

/*
     if~elseif 문

	 if(조건식){
		 실행문;
		 실행문;
     }elseif(조건식){
		 실행문;
		 실행문;
     }elseif(){
		 실행문;
		 실행문;
		 }else{
			 실행문;
			 }
			 */
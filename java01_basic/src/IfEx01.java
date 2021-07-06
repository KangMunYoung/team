import java.util.Scanner;
class IfEx01 
{
	public static void main(String[] args) 
	{
	  Scanner scan = new Scanner(System.in);
	  
	  int first=0, second=0, add=0, minus=0, mul=0, divide=0;
	  //1. 데이터입력
          System.out.print("첫번째 정수=");
		  first = scan.nextInt();
		  System.out.print("두번째 정수=");
	      second = scan.nextInt();
	  //2. 계산
	  if(first>0 && second>0){//두수가 모두 양수일때
		   add = first+second;
		   minus = first-second;
		   mul = first*second;
		   divide = first/second;
	 //3. 출력
			   System.out.printf("%5d + %5d = %5d\n", first, second, add);
		       System.out.printf("%5d - %5d = %5d\n", first, second, minus);
			   System.out.printf("%5d * %5d = %5d\n", first, second, mul);
			   System.out.printf("%5d / %5d = %5d\n", first, second, divide);


	  }else{//그외
          System.out.println("데이터를 잘못입력하였습니다.");
	  }
	 

	 



	}
}
/*
   두수를 입력받아 입력받은 모든 수가 양수일때는 사칙연산을 한 결과를 출력하고
   두수 모두 양수가 아닐때는 "데이터를 잘못입력하였습니다." 라는 메세지를 출력하라.
*/
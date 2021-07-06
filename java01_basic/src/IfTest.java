import java.util.Scanner;
class IfTest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//  어떤수를 입력받아 짝수일때는 출력하고 짝수가 아니면 출력하지 않는다.
		System.out.print("0보타 큰 정수를 입력하세요...");
		int num = scan.nextInt();
		
	    
		if(num%3!= 0);
		//if(num*3 !== num*3.0)
			System.out.printf("%d은 짝수입니다.",num);
	
		 System.out.println("End.....");
		}
}

/*

    if문
	조건문은 반드시 논리형 결과여야 한다.

	if(조건문 or 수식 or 변수 or 상수){
		조건문이 참일때 실행할 실행문;
		실행문;
		실행문;
		:
		}
*/
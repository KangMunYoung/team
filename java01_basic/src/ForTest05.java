import java.util.Scanner;
class ForTest05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=100; i++){	
			if(i%3!=0 &&  i%5!=0){  // i%3!=0 은 3의배수가 아닌 수
				System.out.println(i);
		}
		}
	}
}

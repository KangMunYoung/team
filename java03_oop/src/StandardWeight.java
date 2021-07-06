import java.util.Scanner;
class StandardWeight

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("나이=");
        int age = scan. nextInt();
		System.out.print("성별(1:남성,2:여성)=");
		int sex = scan .nextInt();
		System.out.print("키=");
		int key = scan.nextInt();
		System.out.print("현재체중=");
		int wei = scan.nextInt();
		
		
		int pp=0;  // 표준체중


		if(age<=35){
			switch (sex)
			{
				case 1 : pp =(int) ((key - 100) * 0.90); break;
				case 2 : pp =(int) ((key - 100) * 0.85); break;
			}
		}else if(age>=36){
			switch (sex)
			{
				case 1 : pp =(int) ((key - 100) * 0.95); break;
				case 2 : pp =(int) ((key - 100) * 0.90); break;
			}
		}

		double ff = (double)wei/pp * 100.0; //표준체중 지수
        
		
		String text = "";
		if(ff>=85){
			text = "마른형";
		}else if(ff >= 95){
		 	text = "조금마른형";
		}else if(ff >=115){
			text = "표준형";
		}else if(ff>=125){
			text = "조금 비만형";
		}else if(ff>=126){
			text = "비만형";
		} 
		


		System.out.printf("나이=%d \n" ,age);
		System.out.printf("성별=%d \n" ,sex);
		System.out.printf("키=%d \n" ,key);
		System.out.printf("현재체중=%d \n" ,wei);
		System.out.printf("표준체중=%d \n" ,pp);
		System.out.printf("당신은 표준체중지수는 %f으로 %s입니다. \n",ff,text);
		
		
 
	}
}
	
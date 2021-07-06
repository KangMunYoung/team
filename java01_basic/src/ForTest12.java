class ForTest12
{
	public static void main(String[] args) 
	{

		System.out.print("        구구단\n");
		
		for(int i=1; i<=9; i+=3){
			
			System.out.println("==" +i+"단== "+"=="+(i+1)+"단== "+"=="+(i+2)+"단=="); 

		for(int j=1; j<=9; j++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
		
		System.out.print((i+1)+"*"+j+"="+(i+1)*j+"\t");
		System.out.print((i+2)+"*"+j+"="+(i+2)*j);
		System.out.println("");
		}

		System.out.println("");
		}
	    
	}


}
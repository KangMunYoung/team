class ForTest02 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1; i<=100; i++){ //1,2,3,4,5....100
			sum += i;
			if(i%10==0){//10의배수
			System.out.println("1~"+ i+"까지의 합은"+ sum);
		}
		}
	    //System.out.println("1~10까지의 합은"+ sum);
	
	}
}

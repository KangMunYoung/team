class ForTest01 
{
	public static void main(String[] args) 
	{
		String username = "김도훈";
		for(int i=1; i<=100; i++){
			System.out.print(username+"\t");
		}
		System.out.println();
	
		// 1 ~ 10까지 출력하라.
		for(int a=1; a<=10; a++){
			System.out.println(a);

	}


	// 10 ~ 100까지 10씩 증가
	for(int b=10; b<=100; b+=10){ // b=b+10
		System.out.println(b);

	}
	
	//5부터 1까지 1씩감소

	for(int c=5; c>=1; c--){     // c--  --c   c=c-1  c-=1
		System.out.println(c);

	}
	for(int d=3; d<=20; d+=3){
		System.out.println(d);

	}
	for(int e=100; e>=50; e=e-10){
		System.out.println(e);
	}
	}
	

}

/*

for(초기값; 최종값; 증가값){
	최종값참일때 실행문이 실행됨..

}

*/